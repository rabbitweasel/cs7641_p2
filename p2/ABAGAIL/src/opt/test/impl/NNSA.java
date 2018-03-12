package opt.test.impl;

import func.nn.feedfwd.FeedForwardNetwork;
import func.nn.feedfwd.FeedForwardNeuralNetworkFactory;
import opt.OptimizationAlgorithm;
import opt.SimulatedAnnealing;
import opt.example.NeuralNetworkOptimizationProblem;
import rawData.FixedData;
import shared.*;

public class NNSA {

    FixedData data;

    public NNSA(FixedData data) {
        this.data = data;
    }

    public void run() {

        int trainLength = data.getTrainData().length;
        Instance[] train = new Instance[trainLength];
        for (int i = 0; i < trainLength; i++) {
            train[i] = new Instance(data.getTrainData()[i]);
            train[i].setLabel(new Instance(data.getTrainLabels()[i]));
        }
        int testLength = data.getTestData().length;
        Instance[] test = new Instance[testLength];
        for (int i = 0; i < testLength; i++) {
            test[i] = new Instance(data.getTestData()[i]);
            test[i].setLabel(new Instance(data.getTestLabels()[i]));
        }

        int iterations = 3;
        double averageTime = 0;
        double averageScoreTest = 0;
        double averageScoreTrain = 0;
        for (int j=0; j<iterations; j++) {
            long start = System.currentTimeMillis();
            FeedForwardNeuralNetworkFactory factory = new FeedForwardNeuralNetworkFactory();
            FeedForwardNetwork networkTrain = factory.createClassificationNetwork(new int[]{122, 10, 1});
            FeedForwardNetwork networkTest = factory.createClassificationNetwork(new int[]{122, 10, 1});
            ErrorMeasure measure = new SumOfSquaresError();
            DataSet set = new DataSet(train);
            NeuralNetworkOptimizationProblem nno = new NeuralNetworkOptimizationProblem(
                    set, networkTrain, measure);
            OptimizationAlgorithm o = new SimulatedAnnealing(1E11,0.95, nno);
            FixedIterationTrainer fit = new FixedIterationTrainer(o, 2000); // 5000
            fit.train();
            Instance opt = o.getOptimal();
            networkTrain.setWeights(opt.getData());
            networkTest.setWeights(opt.getData()); // same as above but run both after each iteration for output
            long end = System.currentTimeMillis();
            averageTime += ((end - start) / 1000.0);

            int accuracyTrain = 0;
            for (int i = 0; i < train.length; i++) {
                networkTrain.setInputValues(train[i].getData());
                networkTrain.run();
                double trueValue = train[i].getLabel().getContinuous(0); // 0.1, 0.9
                double estimatedValue = networkTrain.getOutputValues().get(0) * 1.0; // only 1 output layer
                if (estimatedValue >= 0.5 && trueValue > 0.89) accuracyTrain++;
                else if (estimatedValue < 0.5 && trueValue < 0.11) accuracyTrain++;
            }
            System.out.println("train: " + (1.0 * accuracyTrain) / train.length);
            averageScoreTrain += (1.0 * accuracyTrain) / train.length;

            int accuracyTest = 0;
            for (int i = 0; i < test.length; i++) {
                networkTest.setInputValues(test[i].getData());
                networkTest.run();
                double trueValue = test[i].getLabel().getContinuous(0); // 0.1, 0.9
                double estimatedValue = networkTest.getOutputValues().get(0) * 1.0; // only 1 output layer
                if (estimatedValue >= 0.5 && trueValue > 0.89) accuracyTest++;
                else if (estimatedValue < 0.5 && trueValue < 0.11) accuracyTest++;
            }
            System.out.println("test: " + (1.0 * accuracyTest) / test.length);
            averageScoreTest += (1.0 * accuracyTest) / test.length;
        }
        averageTime /= (iterations*1.0);
        averageScoreTrain /= (iterations*1.0);
        averageScoreTest /= (iterations*1.0);
        System.out.println(" ");
        System.out.println("average time: " + averageTime);
        System.out.println("score train: " + averageScoreTrain);
        System.out.println("score test: " + averageScoreTest);
    }
}

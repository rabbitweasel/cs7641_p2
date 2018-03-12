package opt.test.impl;

import func.nn.feedfwd.FeedForwardNetwork;
import func.nn.feedfwd.FeedForwardNeuralNetworkFactory;
import opt.OptimizationAlgorithm;
import opt.example.NeuralNetworkOptimizationProblem;
import opt.ga.StandardGeneticAlgorithm;
import rawData.FixedData;
import shared.*;

public class Entry {

    public Entry() {

    }

    public static void main(String[] args) {

        //int iter = 400;

        String command = "SA";
        if (args.length == 1) {
            command = args[0];
        }

        FixedData data = new FixedData();
        System.out.println(args.length);

        if (command.equalsIgnoreCase("GA")) {
            System.out.println("Running: GA");
            NNGenetic genetic = new NNGenetic(data);
            genetic.run();
        } else if (command.equalsIgnoreCase("SA")) {
            System.out.println("Running: SA");
            NNSA simulatedAnnealing = new NNSA(data);
            simulatedAnnealing.run();
        } else if (command.equalsIgnoreCase("RHC")) {
            System.out.println("Running: RHC");
            NNRHC randomHill = new NNRHC(data);
            randomHill.run();
        }
    }
}

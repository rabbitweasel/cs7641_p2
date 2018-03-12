package rawData;

import opt.test.impl.Functions;

import java.io.BufferedReader;
import java.io.FileReader;

public class FixedData {

    public FixedData() {
        processFiles();
    }

    //static final String[] names = {"BBC","CNN","CNNIBN","NDTV","TIMESNOW"};
    static final String[] names = {"BBC"};
    int trainSize = 1400;
    int testSize = 600;
    int columns = 122;
    double[][] trainData = new double[names.length*(trainSize)][columns];
    double[] trainLabels = new double[names.length*(trainSize)];
    double[][] testData = new double[names.length*(testSize)][columns];
    double[] testLabels = new double[names.length*(testSize)];

    BufferedReader reader = null;
    public void processFiles() {
        System.out.println("starting file load");
        int activeTrainIndex = -1;
        int activeTestIndex = -1;
        for (int nameIndex = 0; nameIndex<names.length; nameIndex++) { // per file
            int index = -1; // per file, up to ~30k
            String[] entry = null;
            String[] line = null;
            try {
                String root = System.getProperty("user.dir");
                String filePath = root.concat("\\p2\\ABAGAIL\\src\\rawData\\").concat(names[nameIndex]).concat(".txt");
                //System.out.println(filePath);
                String text = null;
                reader = new BufferedReader(new FileReader(filePath));
                while ((text = reader.readLine()) != null) {
                    index++;
                    line = text.split(" +");
                    // check if we need this line for training or testing or not at all
                    boolean trainIndex = Functions.checkCachedTrainIndex(index, names[nameIndex]);
                    boolean testIndex = Functions.checkCachedTestIndex(index, names[nameIndex]);
                    if (!trainIndex && !testIndex) {
                        continue; // row not needed
                    }
                    if (trainIndex) activeTrainIndex++;
                    if (testIndex) activeTestIndex++;
                    if (trainIndex && testIndex) System.out.println("error");
                    for (int i = 0; i < line.length; i++) {
                        entry = line[i].split(":");
                        int iVal = Integer.parseInt(entry[0]);
                        if (i == 0) { // labels
                            double dVal = (double) iVal;
                            if (iVal > 0) dVal = 0.9;
                            if (iVal < 0) dVal = 0.1;
                            if (trainIndex) {
                                trainLabels[activeTrainIndex] = dVal;
                            } else if (testIndex) {
                                testLabels[activeTestIndex] = dVal;
                            }
                        } else { // data
                            if (iVal > columns) {
                                continue;
                            }
                            if (trainIndex) {
                                trainData[activeTrainIndex][iVal-1] = Double.parseDouble(entry[1]);
                            } else if (testIndex) {
                                testData[activeTestIndex][iVal-1] = Double.parseDouble(entry[1]);
                            }
                        }
                    }
                }
                reader.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        for (int i=0; i<columns; i++) {
            double minValue = Double.MAX_VALUE;
            double maxValue = Double.MIN_VALUE;
            for (int j=0; j<names.length*(trainSize); j++) {
                double val = trainData[j][i];
                if (val > maxValue) maxValue = val;
                if (val < minValue) minValue = val;
            }
            double spread = maxValue-minValue;
            for (int j=0; j<names.length*(trainSize); j++) {
                double val = trainData[j][i];
                trainData[j][i] = (1.0*val-minValue)/(spread);
            }
        }
        for (int i=0; i<columns; i++) {
            double minValue = Double.MAX_VALUE;
            double maxValue = Double.MIN_VALUE;
            for (int j=0; j<names.length*(testSize); j++) {
                double val = testData[j][i];
                if (val > maxValue) maxValue = val;
                if (val < minValue) minValue = val;
            }
            double spread = maxValue-minValue;
            for (int j=0; j<names.length*(testSize); j++) {
                double val = testData[j][i];
                testData[j][i] = (1.0*val-minValue)/(spread);
            }
        }
        System.out.println("file load completed");
    }

    public double[][] getTrainData() {
        return trainData;
    }

    public double[] getTrainLabels() {
        return trainLabels;
    }

    public double[][] getTestData() {
        return testData;
    }

    public double[] getTestLabels() {
        return testLabels;
    }
}

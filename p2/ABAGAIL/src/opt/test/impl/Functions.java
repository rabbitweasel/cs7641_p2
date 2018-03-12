package opt.test.impl;

import rawData.*;

import static java.lang.Double.sum;

public class Functions {

    public static int[] Append(int[] list_orig, int[] list_new, int offset) {

        int appendSize = list_new.length;
        for (int i=0; i<appendSize; i++) {
            int index = i + appendSize*offset;
            list_orig[index] = list_new[i];
        }

        return list_orig;
    }

    public static int[] lookupDataTrain(String name) {
        if (name.equals("BBC")) {
            return BBC.getBBCIndicesTrain();
        } else if (name.equals("CNN")) {
            return CNN.getCNNIndicesTrain();
        } else if (name.equals("CNNIBN")) {
            return CNNIBN.getCNNIBNIndicesTrain();
        } else if (name.equals("NDTV")) {
            return NDTV.getNDTVIndicesTrain();
        } else if (name.equals("TIMESNOW")) {
            return TIMESNOW.getTIMESNOWIndicesTrain();
        }
        return null;
    }

    public static int[] lookupDataTest(String name) {
        if (name.equals("BBC")) {
            return BBC.getBBCIndicesTest();
        } else if (name.equals("CNN")) {
            return CNN.getCNNIndicesTest();
        } else if (name.equals("CNNIBN")) {
            return CNNIBN.getCNNIBNIndicesTest();
        } else if (name.equals("NDTV")) {
            return NDTV.getNDTVIndicesTest();
        } else if (name.equals("TIMESNOW")) {
            return TIMESNOW.getTIMESNOWIndicesTest();
        }
        return null;
    }

    public static boolean checkCachedTrainIndex(int index, String name) {
        if (name.equals("BBC")) {
            return contains(index, BBC.getBBCIndicesTrain());
        } else if (name.equals("CNN")) {
            return contains(index, CNN.getCNNIndicesTrain());
        } else if (name.equals("CNNIBN")) {
            return contains(index, CNNIBN.getCNNIBNIndicesTrain());
        } else if (name.equals("NDTV")) {
            return contains(index, NDTV.getNDTVIndicesTrain());
        } else if (name.equals("TIMESNOW")) {
            return contains(index, TIMESNOW.getTIMESNOWIndicesTrain());
        }
        return false;
    }

    public static boolean checkCachedTestIndex(int index, String name) {
        if (name.equals("BBC")) {
            return contains(index, BBC.getBBCIndicesTest());
        } else if (name.equals("CNN")) {
            return contains(index, CNN.getCNNIndicesTest());
        } else if (name.equals("CNNIBN")) {
            return contains(index, CNNIBN.getCNNIBNIndicesTest());
        } else if (name.equals("NDTV")) {
            return contains(index, NDTV.getNDTVIndicesTest());
        } else if (name.equals("TIMESNOW")) {
            return contains(index, TIMESNOW.getTIMESNOWIndicesTest());
        }
        return false;
    }

    public static boolean contains(int index, final int[] list) {
        for (int i=0; i<list.length; i++) {
            if (list[i] == index) {
                return true;
            }
        }
        return false;
    }
}

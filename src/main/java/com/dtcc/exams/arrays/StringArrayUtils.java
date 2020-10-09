package com.dtcc.exams.arrays;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] newString = new String[endingIndex - startingIndex];
        try {
            if(startingIndex < 0 && endingIndex < 0) {}

            }

        catch(IllegalArgumentException ex){ }
        catch (NegativeArraySizeException e){}

                for (int i = 0; i < newString.length; i++) {
                    newString[i] = arrayToBeSpliced[startingIndex + i];
                }
        return newString;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] newString = new String[arrayToBeSpliced.length-startingIndex];
        try{
        for (int i = startingIndex + 1; i < newString.length; i++) {
            newString[i] = arrayToBeSpliced[i];
        }}catch(IllegalArgumentException e){ }
        return newString;
    }
}

package com.dtcc.exams.arrays;

import java.util.Arrays;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] subarray = Arrays.asList(arrayToBeSpliced)
                .subList(startingIndex, endingIndex)
                .toArray(new String[0]);

        return subarray;//new String[]{Arrays.toString(subarray)};


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

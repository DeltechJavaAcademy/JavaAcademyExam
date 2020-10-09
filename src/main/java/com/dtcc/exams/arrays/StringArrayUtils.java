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

        if(startingIndex < 0 && endingIndex < 0){
            throw new IllegalArgumentException();
        }else {
            String[] subarray = new String[endingIndex- startingIndex + 1];
            subarray = Arrays.asList(arrayToBeSpliced)
                    .subList(startingIndex, endingIndex)
                    .toArray(new String[0]);
            return subarray;
            //new String[]{Arrays.toString(subarray)};

            


    }}


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if(startingIndex < 0 ) {
            throw new IndexOutOfBoundsException();
        }else if (startingIndex > arrayToBeSpliced.length){
            throw new IllegalArgumentException();
        }
        else {
            String[] subarray = new String[arrayToBeSpliced.length- startingIndex + 1];
            subarray = Arrays.asList(arrayToBeSpliced)
                    .subList(startingIndex, arrayToBeSpliced.length)
                    .toArray(new String[0]);
            return subarray;
}}}

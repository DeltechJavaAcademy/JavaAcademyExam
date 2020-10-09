package com.dtcc.exams.arrays;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        int index = 0;
        String[] splicedArray;
        if(startingIndex >= 0 && endingIndex >= 0 && startingIndex < arrayToBeSpliced.length && endingIndex < arrayToBeSpliced.length){
            splicedArray = new String[endingIndex-startingIndex];
            for (int i = startingIndex; i < endingIndex; i++) {
                splicedArray[index] = arrayToBeSpliced[i];
                index++;
            }
        }
        else if(startingIndex > arrayToBeSpliced.length && endingIndex > arrayToBeSpliced.length){
            throw new IndexOutOfBoundsException();
        }
        else{
            throw new IllegalArgumentException();
        }
        return splicedArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int index = 0;
        String[] splicedArray;
        if(startingIndex >= 0 && startingIndex < arrayToBeSpliced.length){
            splicedArray = new String[arrayToBeSpliced.length-startingIndex];
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                splicedArray[index] = arrayToBeSpliced[i];
                index++;
            }
        }
        else if(startingIndex > arrayToBeSpliced.length){
            throw new IllegalArgumentException();
        }
        else{
            throw new IndexOutOfBoundsException();
        }
        return splicedArray;
    }
}

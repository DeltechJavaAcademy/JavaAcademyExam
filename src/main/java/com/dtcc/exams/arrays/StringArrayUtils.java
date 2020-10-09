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
        if(startingIndex< 0 || endingIndex< 0){throw new IllegalArgumentException();}

        Integer length=arrayToBeSpliced.length;
        String[] subArray=new String[(endingIndex-startingIndex)];
        int index=0;
        for(int i=startingIndex;i<endingIndex;i++){
            subArray[index++]=arrayToBeSpliced[i];
        }
        return subArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        if(startingIndex<0){throw new IndexOutOfBoundsException(); }
        else if(startingIndex>arrayToBeSpliced.length){throw new IllegalArgumentException();}

        String[] newArray=new String[arrayToBeSpliced.length-startingIndex];
        System.arraycopy(arrayToBeSpliced,startingIndex,newArray,0,newArray.length);
        return newArray;
    }
}

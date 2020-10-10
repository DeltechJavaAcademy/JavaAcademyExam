package com.dtcc.exams.arrays;

import java.util.ArrayList;

public class IntegerArrayUtils {

    Integer[] integerArray = {};

    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        Integer[] integerArray2 = new Integer[8];

        ArrayList<Integer> intList = new ArrayList<Integer>(integerArray.length);
        for (int i : integerArray)
        {
            intList.add(i);
        }

        intList.add(valueToBeAdded);

        intList.toArray(integerArray2);

        return integerArray2;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        integerArray[indexToInsertAt] = valueToBeInserted;

        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        Integer elementToReturn = 0;

        elementToReturn = integerArray[indexToFetch];

        return elementToReturn;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {

        Integer[] integerArray3 = integerArray.clone();

        for (int i = 0; i < integerArray3.length; i++) {

            // If current element is odd positioned
            if ((i + 1) % 2 == 1) {
                integerArray3[i]--;

                // If even positioned
            }else {
                integerArray3[i]++;
            }
        }

        return integerArray3;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        for (int i = 0; i < integerArray.length; i++) {

            // If current element is odd positioned
            if ((i + 1) % 2 == 1)
                continue;

                // If even positioned
            else
                integerArray[i]++;

        }

        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {

        Integer[] integerArray4 = input.clone();

        for (int i = 0; i < input.length; i++) {

            // If current element is odd positioned
            if ((i + 1) % 2 == 1)
                integerArray4[i]--;

                // If even positioned
            else
                continue;

        }

        return integerArray4;
    }
}

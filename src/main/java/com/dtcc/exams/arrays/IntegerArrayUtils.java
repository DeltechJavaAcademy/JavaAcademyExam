package com.dtcc.exams.arrays;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        Integer[] temp = new Integer[integerArray.length+1];
        //Copy original contents
        for(int i =0; i < integerArray.length; i++){
            temp[i] = integerArray[i];
        }
        //Add new
        temp[integerArray.length] = valueToBeAdded;
        return temp;
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
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] temp = new Integer[integerArray.length];
        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] % 2 == 0){
                temp[i] = (integerArray[i] + 1);
            }else{
                temp[i] = (integerArray[i] - 1);
            }
        }
        return temp;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] temp = new Integer[integerArray.length];
        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] % 2 == 0){
                temp[i] = (integerArray[i] + 1);
            }else{
                temp[i] = integerArray[i];
            }
        }
        return temp;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] temp = new Integer[input.length];
        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                temp[i] = (input[i]);
            }else{
                temp[i] = (input[i] -1);
            }
        }
        return temp;
    }
}

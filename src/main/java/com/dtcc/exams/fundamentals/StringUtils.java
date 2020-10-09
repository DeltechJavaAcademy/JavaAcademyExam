package com.dtcc.exams.fundamentals;


public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String string = "";
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            string += " ";
        }
        string += stringToBePadded;

        return string;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        int length = stringToBePadded.length();
        for(int i = 0; i < amountOfPadding - length; i++){
            stringToBePadded += " ";
        }
        return stringToBePadded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String string = "";
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            string += stringToBeRepeated;
        }
        return string;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        boolean flag = true;
        int i = 0;
        while(flag == true && i < string.length()){
            if(string.charAt(i)<65 || (string.charAt(i)>90) && (string.charAt(i)<97) || string.charAt(i)>122){
                if(string.charAt(i) == ' '){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
            i++;
        }
        return flag;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean flag = true;
        int i = 0;
        while(flag == true && i < string.length()){
            if((string.charAt(i)< 48 || string.charAt(i)> 57)){
                flag = false;
            }
            i++;
        }
        return flag;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        boolean flag = true;
        int i = 0;
        while(flag == true && i < string.length()){
            if((string.charAt(i)>='0' && string.charAt(i)<='9') ||
                    (string.charAt(i)>='A' && string.charAt(i)<='Z') ||
                    ( string.charAt(i) >='a' && string.charAt(i) <='z')){
                flag = false;
            }
            i++;
        }
        return flag;
    }
}

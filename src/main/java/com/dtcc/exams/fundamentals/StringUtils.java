package com.dtcc.exams.fundamentals;


public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String temp ="";
        for(int i =amountOfPadding - stringToBePadded.length(); i > 0; i--){
            temp += " ";
        }
        return temp + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String temp =stringToBePadded;
        for(int i =amountOfPadding - stringToBePadded.length(); i > 0; i--){
            temp += " ";
        }
        return temp;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String temp ="";
        for(int i =numberOfTimeToRepeat; i > 0; i--){
            temp += stringToBeRepeated;
        }
        return temp;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        boolean bool = true;
        String temp = string.toLowerCase();
        char[] ch= temp.toCharArray();
        for(int i =0; i < string.length();i++) {
            System.out.print(ch[i]);
            if (!((ch[i] >= 'a' && ch[i] <= 'z') || ch[i] == ' ')) {
                bool = false;
            }
        }
        return bool;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean bool = true;
        String temp = string.toLowerCase();
        char[] ch= temp.toCharArray();
        for(int i =0; i < string.length();i++) {
            System.out.print(ch[i]);
            if (!((ch[i] >= '0' && ch[i] <= '9') || ch[i] == ' ')) {
                bool = false;
            }
        }
        return bool;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
         return (string.matches("[!-*]+"));
    }
}

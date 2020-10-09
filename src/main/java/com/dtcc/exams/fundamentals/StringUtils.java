package com.dtcc.exams.fundamentals;


public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
        //"%1$" + n + "s", str

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String s = new String(new char[numberOfTimeToRepeat]).replace("\0", stringToBeRepeated);
        return s;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        if(string != null && string.matches("^[ A-Za-z]+$")){
            return true;
        }else{
            return false;
        }

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if(string != null && string.matches("[0-9]+")){
            return true;
        }else{
            return false;
        }
        //[0-9]+
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";

            for (int i = 0; i < string.length(); i++) {
                if (specialCharacters.contains(Character.toString(string.charAt(i))))
                {
                return true;
        }else{
            return false;
        }
        //-/@#$%^&_+=()
        //!&*(
    }
    return false;
    }}


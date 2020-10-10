package com.dtcc.exams.fundamentals;


public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return null;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return null;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sBuild = new StringBuilder();
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            sBuild.append(stringToBeRepeated);
        }
        return sBuild.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        char[] anotherChar = string.toCharArray();
        for (int i = 0; i < anotherChar.length; i++) {
            if (Character.isAlphabetic(anotherChar[i])) {
                return true;
            }else if(!Character.isAlphabetic(anotherChar[i]))
                return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        char[] anotherChar = string.toCharArray();
        for (int i = 0; i < anotherChar.length; i++) {
            if (Character.isDigit(anotherChar[i])) {
                return true;
            }else
                return false;
        }
        return false;
    }
    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String specialChars = "/*!@#$%^&*()_+|{}[]";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (specialChars.contains((Character.toString(ch)))) {
                return true;
            }else
                return false;
        }
        return false;
    }

    public static class PredicateUtilities {
        /**
         * @param value - the value to be evaluated
         * @return true if `value` is a multiple of 2
         */
        public static Boolean isEven(Integer value) {
            if(value % 2 ==0){
                return true;
            }else
            return false;
        }

        /**
         * @param value - the value to be evaluated
         * @return true if `value` is not a multiple of 2
         */
        public static Boolean isOdd(Integer value) {
            if(value % 2 != 0){
                return true;
            }else
            return false;
        }

        /**
         * @param value - the value to be evaluated
         * @return true if `value` is a multiple of 3
         */
        public static Boolean isMultipleOf3(Integer value) {
            if(value % 3 == 0) {
                return true;
            }else
            return false;
        }

        /**
         *
         * @param value - the value to be evaluated
         * @param multiple - the multiple to test `value` against
         * @return true if `value` is a multiple of `multiple`
         */
        public static Boolean isMultipleOfN(Integer value, Integer multiple) {
            if(value % multiple == 0) {
                return true;
            }else
                return false;
        }

        /**
         * @param string - the string to be evaluated
         * @return true if `string` starts with a capital letter
         */
        public static Boolean startsWithCapitalLetter(String string) {
            char [] newChar = string.toCharArray();
            if(Character.isUpperCase(newChar[0])){
                return true;
            }else
            return false;
        }
    }
}

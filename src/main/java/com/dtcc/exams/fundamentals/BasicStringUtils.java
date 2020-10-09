package com.dtcc.exams.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String string2 = "";
        int length = string1.length();
        for(int i = length - 1; i >= 0; i--){
            string2 += string1.charAt(i);
        }
        return string2;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String string3 = "";
        int length = string1.length();
        for(int i = length - 1; i >= 0; i--){
            string3 += string1.charAt(i);
        }
        String string4 = "";
        int length2 = string2.length();
        for(int i = length2 - 1; i >= 0; i--){
            string4 += string2.charAt(i);
        }
       String string5 = string3 + string4;
        return string5;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        return string.replaceAll("[ " + charactersToRemove + "]", "") ;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
       String string1 = string.replaceAll("[ " + charactersToRemove + "]", "");
        String string2 = "";
        int length = string1.length();
        for(int i = length - 1; i >= 0; i--){
            string2 += string1.charAt(i);
        }
        return string2;
    }
}

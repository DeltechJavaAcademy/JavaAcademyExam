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
        StringBuffer rev = new StringBuffer(string1);
        return String.valueOf(rev.reverse());

    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuffer rev1 = new StringBuffer(string1);
        rev1.reverse();
        StringBuffer rev2 = new StringBuffer(string2);
        rev2.reverse();
        return rev1.toString() + rev2.toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
//        char[] ch = charactersToRemove.toCharArray();
//        for(int i = 0; i < ch.length; i++){
//            if(string.contains(charactersToRemove)){
//                string.replaceAll();
//
//            }
//        }
//        if(ch)


        return string.replaceAll(charactersToRemove, "");
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return null;
    }
}

package com.dtcc.exams.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String newString = "";
        if(string1!=null) {
            for (int i = string1.length()-1; i >= 0; i--) {
                newString +=string1.charAt(i) + "";
            }
        }
        return newString;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String newString1 = "";
        String newString2 = "";
        if(string1!=null || string2!=null) {
            for (int i = string1.length()-1; i >= 0; i--) {
                newString1 +=string1.charAt(i) + "";
            }
            for (int j= string2.length()-1; j >= 0; j--) {
                newString2 +=string2.charAt(j) + "";
            }
        }
        return newString1+newString2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        return string.replaceAll("[ " + charactersToRemove + "]", "") ;

    }

    public static String removeChar(String str,int index){
        return str.substring(0,index)+str.substring(index+1);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String string1 = string.replaceAll("[ " + charactersToRemove + "]", "");
        String newString = "";
        int length = string1.length();
        for(int i = length - 1; i >= 0; i--){
            newString += string1.charAt(i);
        }
        return newString;
    }
}

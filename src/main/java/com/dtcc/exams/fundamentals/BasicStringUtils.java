package com.dtcc.exams.fundamentals;

import java.util.regex.Pattern;

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
        StringBuilder emad = new StringBuilder();
        emad.append(string1);
        emad = emad.reverse();
        string1 = emad.toString();
        return string1;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder emad = new StringBuilder();
        emad.append(string1);
        emad = emad.reverse();
        string1 = emad.toString();

        StringBuilder emad1 = new StringBuilder();
        emad1.append(string2);
        emad1 = emad1.reverse();
        string2 = emad1.toString();
        return string1 + string2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
//        if(string.contains(charactersToRemove)){
//            String tempWord = charactersToRemove + " ";
//            string = string.replaceAll(tempWord,"");
//            tempWord = " " + charactersToRemove;
//            string = string.replaceAll(tempWord, "");
//        }
        Pattern pattern = Pattern.compile(charactersToRemove);
        string.replaceAll(pattern.toString(), "");

        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
            string.replaceAll(charactersToRemove, "");
            byte[] strAsByteArray = string.getBytes();
            byte[] result = new byte[strAsByteArray.length];

            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];


        return new String(result);
    }
}

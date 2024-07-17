package com.company.core.strings;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {

    /**
     * Abbreviates a string using ellipses.
     *
     * @param source    The string to modify
     * @param maxLength Maximum length of the resulting string
     * @return The abbreviated String.
     * @author Nikolay Voynov
     */
    public static String abbreviate(String source, int maxLength) {
        if (maxLength >= source.length()) {
            return source;
        }

        String first = source.substring(0, maxLength);
        String second = "...";

        return concat(first, second);
    }

    /**
     * Capitalizes a string changing the first character to title case. No other characters are changed.
     * If source is empty returns empty string.
     *
     * @param source The string to modify
     * @return The capitalized string or empty string if `source` is empty.
     * @author Nikolay Voynov
     */
    public static String capitalize(String source) {
        if (checkIfIsEmpty(source)) {
            return source;
        }

        char capitalLetter = source.charAt(0);
        String secondStr = source.substring(1);

        return Character.toUpperCase(capitalLetter) + secondStr;
    }

    /**
     * Concatenates `string1` to the end of `string2`.
     *
     * @param string1 The left part of the new string
     * @param string2 The right part of the new string
     * @return A string that represents the concatenation of string1 followed by string2's characters.
     * @author Nikolay Voynov
     */
    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * Checks if `source` contains a `symbol`.
     *
     * @param source The string to check
     * @param symbol The character to check for
     * @return `true` if `symbol` is within `source` or `false` if not.
     * @author Nikolay Voynov
     */
    public static boolean contains(String source, char symbol) {
        char[] charArr = source.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == symbol) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if the string `source` ends with the given character.
     *
     * @param source The string to check
     * @param target The character to check for
     * @return `true` if the string ends with `target`, else `false`.
     * @author Nikolay Voynov
     */
    public static boolean endsWith(String source, char target) {
        if (checkIfIsEmpty(source)) {
            return false;
        }

        return source.charAt(source.length() - 1) == target;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }
    // Emiliyan Geshkov

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    }
    // Emiliyan Geshkov

    public static String pad(String source, int length, char paddingSymbol) {
        return null;

    }
    // Emiliyan Geshkov

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    }
    // Emiliyan Geshkov

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;

    }
    // Emiliyan Geshkov

    public static String repeat(String source, int times) {
        return null;
    }
    // Ismail Emin

    public static String reverse(String source) {
        return null;
    }
    // Ismail Emin

    public static String section(String source, int start, int end) {
        return null;
    }
    // Ismail Emin

    public static boolean startsWith(String source, char target) {
        return false;
    }
    // Ismail Emin

    private static boolean checkIfIsEmpty(String source) {
        return source.length() == 0;
    }

}

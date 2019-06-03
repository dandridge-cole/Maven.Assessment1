package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
       str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse = "";
        int size = str.length();

        for (int i = size - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverse = "";
        int size = str.length();

        for (int i = size - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        reverse = reverse.substring(0,1).toUpperCase() + reverse.substring(1).toLowerCase();
        return reverse;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        int last = str.length();


        return str.substring(1, last-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char [] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }

        return new String(chars);
    }
}

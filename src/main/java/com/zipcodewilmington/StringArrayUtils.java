package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String element : array){
            if(element.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        int x = 0;
        for(int i = array.length - 1; i >= 0; i--){
            reverse[x] = array[i];
            x++;
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverse = new String[array.length];
        int x = 0;
        for(int i = array.length - 1; i >= 0; i--){
            reverse[x] = array[i];
            x++;
        }
        return Arrays.equals(reverse, array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] boolArr = new boolean[26];
        String add = "";
        Integer index = 0;

        for(int i = 0; i < array.length; i++){
            add += array[i];
        }
        add = add.replace(" ", "");

        for(int x = 0; x < add.length(); x++){
            if('a' <= add.charAt(x) && add.charAt(x) <= 'z'){
                index = add.charAt(x) - 'a';
            } else if('A' <= add.charAt(x) && add.charAt(x) <= 'Z'){
                index = add.charAt(x) - 'A';
            }
            boolArr[index] = true;
        }
        for(int y = 0; y <= 25; y++){
            if(!boolArr[y]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occ = 0;
        for(String iteration : array){
            if(iteration.equals(value)){
                occ++;
            }
        }

        return occ;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int i = 0;
        String[] output = new String[array.length - 1];
        for(String counter : array){
            if(!counter.equals(valueToRemove)){
                output[i++] = counter;
            }
        }

        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int i = 1;

        for(int x = 1; x < array.length; x++){
            if(!array[x].equals(array[x - 1])){
                i++;
            }
        }
        String[] output = new String[i];
        i = 0;

        StringBuilder build = new StringBuilder(array[0]);

        for(int x = 1; x < array.length; x++){
            if(!array[x].equals(array[x - 1])){
                output[i] = build.toString();
                build = new StringBuilder(array[x]);
                i++;
            }
        }
        output[i] = build.toString();
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int i = 1;

        for(int x = 1; x < array.length; x++){
            if(!array[x].equals(array[x - 1])){
                i++;
            }
        }
        String[] output = new String[i];
        i = 0;

        StringBuilder build = new StringBuilder(array[0]);

        for(int x = 1; x < array.length; x++){
            if(array[x].equals(array[x - 1])){
                build.append(array[x]);
            } else{
            output[i] = build.toString();
            build = new StringBuilder(array[x]);
            i++;
            }
        }
        output[i] = build.toString();
        return output;
    }


}

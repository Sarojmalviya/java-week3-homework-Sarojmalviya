package java_week3_homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class NumericAndStringArraySort {
    public static void main(String[] args) {
        int[] numericArray = {5, 2, 9, 1, 6};
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array:");
        for (int num : numericArray) {
            System.out.println(num + " ");
        }
        String[] stringArray = {"apple", "grape", "kiwi", "mango", "orange"};
        Arrays.sort(stringArray);
        System.out.println("Sorted string array:");
        for(String str : stringArray){
            System.out.println(str + "");
        }

    }

}

package java_week3_homework;

import java.util.Arrays;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class ArrayContainsValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int targetValue = 3;
        boolean found = false;
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The array contains the value " + targetValue + ".");
        } else {
            System.out.println("The array does not contain the value " + targetValue + ".");
        }
        if (Arrays.stream(numbers).anyMatch(x -> x == targetValue)) {
            System.out.println("The array contains the value " + targetValue + ".");
        } else {
            System.out.println("The array does not contain the value " + targetValue + ".");
        }
    }
}




package java_week3_homework;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 4, 9,7 };
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        double average = (double) sum/ numbers.length;
        System.out.println("Average of the array element: " + average);
        }
    }


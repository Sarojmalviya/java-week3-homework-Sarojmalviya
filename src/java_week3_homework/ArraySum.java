package java_week3_homework;

/**
 * Write a Java program to sum values of an array.
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] number = {5, 2, 9, 1, 6};
        int sum = 0;
        for (int num : number) {
            sum += num;
        }
        System.out.println("Sum of the array element: " + sum);
    }
}



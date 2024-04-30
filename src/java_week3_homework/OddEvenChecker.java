package java_week3_homework;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
        System.out.println(number + "is even number.");
    }
    else {
            System.out.println(number + "is odd number.");
            scanner.close();
        }
    }
}

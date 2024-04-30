package java_week3_homework;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operator(+, -, *, /):");
        char operator = scanner.next().charAt(0);
        double result = 0;
        if(operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        }else if(operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return;
            }
        }else{
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result: " +result);
    }
    }



package java_week3_homework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.println("Enter sales details:");
        System.out.print("Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate commission
        double commission;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Print sales commission
        System.out.println("Sales Commission for " + sellerName + " (ID: " + salesId + ") is: $" + commission);
    }
}




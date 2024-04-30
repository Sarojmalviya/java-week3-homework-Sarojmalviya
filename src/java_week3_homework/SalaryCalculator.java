package java_week3_homework;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.println("Enter employee details:");
        System.out.print("Employee Id: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate salary components
        double hra, ta, da, pf, grossSalary;
        switch ((int) basicSalary) {
            case 50000:
                hra = basicSalary * 0.10;
                ta = basicSalary * 0.08;
                da = basicSalary * 0.09;
                pf = basicSalary * 0.20;
                break;
            case 30000:
                hra = basicSalary * 0.10;
                ta = basicSalary * 0.08;
                da = basicSalary * 0.09;
                pf = basicSalary * 0.20;
                break;
            case 20000:
                hra = basicSalary * 0.10;
                ta = basicSalary * 0.08;
                da = basicSalary * 0.09;
                pf = basicSalary * 0.20;
                break;
            case 10000:
                hra = basicSalary * 0.10;
                ta = basicSalary * 0.08;
                da = basicSalary * 0.09;
                pf = basicSalary * 0.20;
                break;
            default:
                hra = basicSalary * 0.10;
                ta = basicSalary * 0.08;
                da = basicSalary * 0.09;
                pf = basicSalary * 0.20;
        }
        grossSalary = basicSalary + hra + ta + da - pf;

        // Print salary slip
        System.out.println("___________");
        System.out.println("| Salary Slip                  |");
        System.out.println("|__________|");
        System.out.println("| Employee Id : " + empId + "        |");
        System.out.println("| Employee Name : " + empName + "     |");
        System.out.println("|__________|");
        System.out.println("| Basic Salary    | HRA 10% | TA 8% | DA 9% | PF 20%");
        System.out.printf("| %.2f           | %.2f   | %.2f  | %.2f  | %.2f  |\n", basicSalary, hra, ta, da, pf);
        System.out.println("|__________|");
        System.out.println("| Gross Salary : " + grossSalary + "     |");
        System.out.println("|===========================|");
    }



}

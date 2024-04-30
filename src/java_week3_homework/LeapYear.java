package java_week3_homework;

import java.util.Scanner;

/**Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 ==0){
            if(year % 100 == 0){
                isLeapYear = (year % 400 == 0);
            }
        }
        if(isLeapYear) {
            System.out.println(year + "  is a Leap Year");
        }else
            {
                System.out.println(year + "  is not a Leap Year");
        }
    }
}

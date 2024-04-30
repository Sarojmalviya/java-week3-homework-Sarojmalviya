package java_week3_homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class CityNameIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        alphabet = Character.toUpperCase(alphabet);

        String cityName;
        if (alphabet == 'A') {
            cityName = "Alperton";
        } else if (alphabet == 'B') {
            cityName = "Brent";
        } else if (alphabet == 'C') {
            cityName = "Croydon";
        } else if (alphabet == 'D') {
            cityName = "dubai";
        } else if (alphabet == 'E') {
            cityName = "Edinburgh";
        } else if (alphabet == 'F') {
            cityName = "France";
        } else {
            cityName = "Invalid entry";
        }
        System.out.println("City name: " + cityName);
    }
}



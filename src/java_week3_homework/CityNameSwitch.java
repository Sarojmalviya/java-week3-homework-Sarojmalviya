package java_week3_homework;
/**
 * Same as above program-8 using switch statement.
 */
import java.util.Scanner;
public class CityNameSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0);


        if (alphabet < 'A' || alphabet > 'F') {
            System.out.println("Invalid entry");
            return; // Exit the program
        }
        String cityName;
        switch (alphabet) {
            case 'A':
                cityName = "Amersham";
                break;
            case 'B':
                cityName = "Birmingham";
                break;
            case 'C':
                cityName = "Chesham";
                break;
            case 'D':
                cityName = "Dartford";
                break;
            case 'E':
                cityName = "Earl's court";
                break;
            case 'F':
                cityName = "Finchley";
                break;
            default:
                cityName = "Invalid entry";
        }

        // Print the city name
        System.out.println("City name: " + cityName);
    }
}



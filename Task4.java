import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nTemperature Converter:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }
            
            System.out.print("Enter the temperature: ");
            double temperature = scanner.nextDouble();
            double convertedTemperature;

            switch (choice) {
                case 1:
                    convertedTemperature = fahrenheitToCelsius(temperature);
                    System.out.println("Temperature in Celsius: " + convertedTemperature);
                    break;
                case 2:
                    convertedTemperature = celsiusToFahrenheit(temperature);
                    System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
        System.out.println("Developed By Sarthak");
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
//Time Complexity:
//Conversion Methods: O(1) - Each method performs a constant number of arithmetic operations.
//Main Method: The main loop runs in O(1) time for each user interaction, as the input reading and conversion calculations are constant time operations.
import java.util.Random;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // Step 2: Define the game rules and logic
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1; // Random number between 1 and 50
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 50.");
        System.out.println("Try to guess it!");

        // Step 3: Use conditional statements to manage game flow
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            numberOfTries++;
            
            if (playerGuess < 1 || playerGuess > 50) {
                System.out.println("Please guess a number between 1 and 50.");
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                hasGuessedCorrectly = true;
            }
        }
        
        System.out.println("You guessed the number in " + numberOfTries + " tries.");
        System.out.println("Developed By Sarthak");
        scanner.close();
    }
}
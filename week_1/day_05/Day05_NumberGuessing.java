package week_1.day_05;
import java.util.Scanner;

public class Day05_NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        // This outer loop keeps the program running until the user types "no"
        do {
            System.out.println("\n--- New Game ---");
            System.out.println("Enter the range of numbers you want to guess between.");
            System.out.print("Enter the minimum number: ");
            int min = scanner.nextInt();
            System.out.print("Enter the maximum number: ");
            int max = scanner.nextInt();

            int range = max - min + 1;
            int randomNumber = (int) (Math.random() * range) + min;

            boolean hasGuessedCorrectly = false;
            int attempts = 0;
            
            // Setting a maximum number of attempts so the user can "get it wrong"
            int maxAttempts = 7; 
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            // Inner loop: runs until they guess correctly OR run out of attempts
            while (!hasGuessedCorrectly && attempts < maxAttempts) {
                System.out.print("\nGuess a number between " + min + " and " + max + ": ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    System.out.println("It took you " + attempts + " attempts.");
                    hasGuessedCorrectly = true; // This breaks the loop
                } else {
                    int difference = Math.abs(randomNumber - userGuess);
                    String temperature = (difference <= 5) ? "Hot!" : "Cold!";
                    String direction = (userGuess < randomNumber) ? "higher" : "lower";

                    // Check if they have attempts left to give hints, otherwise show game over
                    if (attempts < maxAttempts) {
                        System.out.println("Sorry, incorrect. You are " + temperature + " Try guessing " + direction + ".");
                        System.out.println("Attempts remaining: " + (maxAttempts - attempts));
                    } else {
                        System.out.println("Game Over! You've run out of attempts.");
                        System.out.println("The correct number was: " + randomNumber);
                    }
                }
            }

            // Ask the user if they want to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }
}
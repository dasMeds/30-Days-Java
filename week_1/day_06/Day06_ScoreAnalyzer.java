package week_1.day_06;
import java.util.*;

    public class Day06_ScoreAnalyzer {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of score to analyze: "); // Basic I/O: Determine the size of the array
            int numScores = sc.nextInt();

                if (numScores <= 0) {
                    System.out.println("Please enter a positive number of scores.");
                    return;
                }

                double[] scores = new double[numScores]; // Array Initialization

                    System.out.println("\n--- Enter the scores ---"); // For Loop & I/O: Populate the array
                        for (int i = 0; i < numScores; i++) {
                            System.out.print("Score " + (i + 1) + ": ");
                        scores[i] = sc.nextDouble();
                    }

                    // Initialize variables for the calculations

                    double sum = 0;
                    double max = scores[0];
                    double min = scores[0];
                    double passingGrade = 50.0;

            System.out.println ("\n--- Individual Results ---"); // For Loop: Analyze the array data
                for (int i = 0; i < numScores; i++) {
                    double currentScore = scores[i];

                sum += currentScore; // Add to sum for the average calculation

                    if (currentScore > max) {  // Check for new maximum
                        max = currentScore;
            }
                if (currentScore < min) { // Check for new minimum
                min = currentScore;
            }
            // Determine pass or fail
            String status = (currentScore >= passingGrade) ? "Pass" : "Fail";
                System.out.println("Student " + (i + 1) + " (" + currentScore + "): " + status);
            }

                double average = sum / numScores;

                System.out.println("\n--- Summary ---"); // For Loop: Calculate and display summary statistics
                    System.out.printf("Average Score: %.2f%n", average);
                        System.out.printf("Highest Score: %.2f%n", max);
                            System.out.printf("Lowest Score: %.2f%n", min);

                sc.close();
        }
    }
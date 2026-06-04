package week_1.day_03;

import java.util.*;

public class Day03_GradeClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Enter the number of grades to be calculated: ");
        int numberOfGrades = sc.nextInt();
    
        double sum = 0;
        for (int currentGrade = 1; currentGrade <= numberOfGrades; currentGrade++) {
            System.out.print("Enter grade " + currentGrade + ":");
            double grade = sc.nextDouble();
            sum += grade;

        }
        double average = sum / numberOfGrades;
        System.out.printf("The average grade is: %.2f%n", average);

        if (average >= 90 && average <= 100){
            System.out.print("Your Grade is: A");
        } else if (average >= 80 && average < 90){
            System.out.print("Your Grade is: B");
        } else if (average >= 70 && average < 80){
            System.out.print("Your Grade is: C");
        } else if (average >= 60 && average < 70){
            System.out.print("Your Grade is: D");
        } else if (average >= 0 && average < 60){
            System.out.print("Your Grade is: F");
        } else {
            System.out.print("Invalid average grade calculated. Please check the input grades and try again.");
        }

        System.out.print("Do you want to calculate another set of grdades? (Y/N): ");
                char calculateAgain = sc.next().charAt(0);
                    calculateAgain = Character.toUpperCase(calculateAgain);
                    if (calculateAgain != 'Y'){
                        System.out.print("Thank you for using the grade classifier. Goodbye!");
                        break;
                    }

        } while (true);
    }
}

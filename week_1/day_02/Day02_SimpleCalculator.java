package week_1.day_02;

import java.util.*;
public class Day02_SimpleCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the first number: ");
                double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
                double num2 = sc.nextDouble();
            
                System.out.print("Select the operator to be used [+, -, *. /, %]: ");
                    char operator = sc.next().charAt(0);

                    if (operator == '+') {
                        double result = num1 + num2;
                        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                    }
                    else if (operator == '-') {
                        double result = num1 - num2;
                        System.out.printf("%.2f - %.2f = %.2f%nq", num1, num2, result);
                    }
                    else if (operator == '*') {
                        double result = num1 * num2;
                        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                    }
                    else if (operator == '/') {
                        double result = num1 / num2;
                        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                    }
                    else if (operator == '%') {
                        double result = num1 % num2;
                        System.out.printf("%.2f %% %.2f = %.2f%n", num1, num2, result);
                    }
                    else {
                        System.out.print("Invalid operator selected. Please select one of the following operators: +. -. *. /, %");
                    }
        
                    System.out.print("Do you want to perform another calculation? (Y/N): ");
                        char calculateAgain = sc.next().charAt(0);
                            calculateAgain = Character.toUpperCase(calculateAgain);
                            if (calculateAgain != 'Y'){
                                System.out.print("Thank you for using the simple calculator. Goodbye!");
                                break;
                            }

            } while (true); // Infinite loop to allow continuous calculations until the user decides to exit
            
    }
    
}

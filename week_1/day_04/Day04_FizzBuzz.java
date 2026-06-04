package week_1.day_04;
import java.util.*;

public class Day04_FizzBuzz {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        char tryAnotherNumber;

    do {

        System.out.print("Enter a number: ");
        int inputedNumber = sc.nextInt();

        for (int num = 1; num <= inputedNumber; num++){
            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0){
                System.out.println("Fizz");
            } else if (num % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println("The number " + num + " is not divisible by 3 or 5. Please try again with a different number.");
            }
        }
            System.out.print("Do you want to try another number? (Y/N): ");
            tryAnotherNumber = sc.next().charAt(0);
            tryAnotherNumber = Character.toUpperCase(tryAnotherNumber);
            
        } while (tryAnotherNumber == 'Y');

        System.out.println("Thank you for playing FizzBuzz. Goodbye!");
        sc.close();
    }
    
}


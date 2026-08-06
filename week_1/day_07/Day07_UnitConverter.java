package week_1.day_07;
import java.util.*;

public class Day07_UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueConversion = true;

            System.out.print("Welcome to the Unit Converter!\n");

        while(continueConversion) {
            System.out.println("\n--- Conversion Menu ---");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Pounds to Kilograms");
            System.out.println("5. Liters to Gallons (US)");
            System.out.println("6. Gallons (US) to Liters");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-6): ");

            int choice = sc.nextInt();

                if (choice == 0) {
                    continueConversion = false;
                        System.out.print("Exiting the Unit Converter. Goodbye!\n");
                        continue;
                }

                if (choice < 0 || choice > 6) {
                    System.out.print("Invalid choice. Please try again.\n");
                    continue;
                }

                System.out.print("Enter the value to convert: ");
                    double value = sc.nextDouble();
                    double result = 0.0;

                switch(choice) {
                    case 1:
                    result = UnitConverter.kmToMi(value);
                    System.out.printf("%.2f km is equal to %.2f miles.\n", value, result);
                    break;
                case 2:
                    result = UnitConverter.miToKm(value);
                    System.out.printf("%.2f miles is equal to %.2f km.\n", value, result);
                    break;
                case 3:
                    result = UnitConverter.kgToLb(value);
                    System.out.printf("%.2f kg is equal to %.2f lbs.\n", value, result);
                    break;
                case 4:
                    result = UnitConverter.lbToKg(value);
                    System.out.printf("%.2f lbs is equal to %.2f kg.\n", value, result);
                    break;
                case 5:
                    result = UnitConverter.lToGal(value);
                    System.out.printf("%.2f liters is equal to %.2f gallons.\n", value, result);
                    break;
                case 6:
                    result = UnitConverter.galToL(value);
                    System.out.printf("%.2f gallons is equal to %.2f liters.\n", value, result);
                    break;
                }
        }
        sc.close();
    } 
}

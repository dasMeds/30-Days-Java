//Day01_TemperatureConverter that takes input from the user and converts it to the desired unit 

package week_1.Day01;
import java.util.*;

public class Day01_TemperatureConverter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{

            System.out.print("Enter the temperature value: ");
                double temperatureValue = sc.nextDouble();
                System.out.print("Enter the current unit (C - Celsius, F - Fahrenheit, K - Kelvin): ");
                    char currentUnit = sc.next().charAt(0);
                        currentUnit = Character.toUpperCase(currentUnit); // Converts the user input to uppercase to handle both lower and upper case

                        switch (currentUnit) {
                            case 'C':
                                double fahrenheitFromCelsius = (temperatureValue * 9.0/5) + 32;
                                double kelvinFromCelsius = (temperatureValue + 273.15);
                                System.out.printf("%.2f °C is equal to %.2f °F and %.2f K%n", temperatureValue, fahrenheitFromCelsius, kelvinFromCelsius);
                                break;

                            case 'F':
                                double celsiusFromFahrenheit = (temperatureValue - 32) * 5/9;
                                double kelvinFromFahrenheit = (temperatureValue - 32) * 5/9 + 273.15;
                                System.out.printf("%.2f °F is equal to %.2f °C and %.2f K%n", temperatureValue, celsiusFromFahrenheit, kelvinFromFahrenheit);
                                break;

                            case 'K':
                                double celsiusFromKelvin = (temperatureValue - 273.15);
                                double fahrenheitFromKelvin = (temperatureValue - 273.15) * 9/5 + 32;
                                System.out.printf("%.2f °K is equal to %.2f °C and %.2f °F%n", temperatureValue, celsiusFromKelvin, fahrenheitFromKelvin);
                                break;
                            default:
                                System.out.println("Invalid unit entered. Please enter C, F, or K.");
                        }
                
            System.out.print("Do you want to convert another temperature? (Y/N): ");
                char convertAgain = sc.next().charAt(0);
                    convertAgain = Character.toUpperCase(convertAgain);
                    if (convertAgain != 'Y'){
                        System.out.println("Thank you for using the temperature converter. Goodbye!");
                        break;
                    }

        } while (true); // Infinite loop to allow continuous conversions until the user decides to exit
            // exits the loop if the user does not want to convert again

    }
}


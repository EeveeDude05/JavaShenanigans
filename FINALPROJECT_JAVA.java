// Write a program that allows the user to convert temperatures to Fahrenheit, Celsius and Kelvin, then displays the values.

// The program is to be menu driven. Validate user input for acceptable values. The program should display the following menu of selections:

// Convert Fahrenheit to Celsius
// Convert Celsius to Fahrenheit
// Convert Fahrenheit to Kelvin
// Display Data
// Quit Program
// Enter your selection (1-5):

// Assignment Specific Requirements:

// Write a main method to control the program. Within main when one temperature changes, change all temperatures – Fahrenheit, Celsius and Kelvin. All the new temperatures should be calculated and stored in a local array for output. Store each in their own array. Temperature conversions are only to be done within the methods designed for that purpose. Do not convert any temperature outside of those conversion methods.
// Write a return method named showMenu that displays the menu. This method should not accept any arguments but should return a valid selection value (1-5). Validation of the input should take place within showMenu. Output an appropriate error message to the user if the choice is not acceptable, then redisplay the menu. DO NOT CALL SHOWMENU FROM INSIDE THE METHOD.
// Write a return method named getTemperature(). It has one argument, the type of temperature being requested as a String data type – Fahrenheit, or Celsius. This text value should be concatenated with the prompt to the user. It should prompt the user to input a temperature and return that value to the calling statement. Validate input and output an appropriate error message.
// Write a return method named calcCelsius, which accepts the Fahrenheit temperature as an argument. The method should return the converted value to main for storage. Convert degrees F to C using the following formula:
// C = (5/9)(F – 32)
// Write a return method named calcFahrenheit, which accepts the Celsius temperature as an argument. The method should return the converted value to main for storage. Convert degrees C to F using the following formula:
// F = (C x 9/5) + 32
// Write a return method named calcKelvin, which accepts the Fahrenheit temperature as an argument. Convert degrees F to K using the following formula:
// K = C + 273.15
// or
// K = (5/9)(F – 32) + 273.15
// Create a void method named displayData(), which receives three (3) arguments – the Fahrenheit, Celsius and Kelvin value arrays. Format output to two digits passed the decimal point. Trailing zeros should display. All decimal points should align in the columns of data when output.
// For every value entered, all three temperatures should be calculated – Fahrenheit, Celsius, and Kelvin.
// The program should continue to execute until the user enters 5 to quit the program.
// The program should accept both positive and negative temperatures.
// If the user selects an invalid choice from the menu, the program should display an appropriate error message and not return to main until a valid selection is made.
// utput data in an appropriately designed and labeled formatted table.

import java.util.Scanner;

public class FINALPROJECT_JAVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] fahrenheitArray = new double[100];
        double[] celsiusArray = new double[100];
        double[] kelvinArray = new double[100];
        int count = 0;

        while (true) {
            int selection = showMenu(scanner);
            if (selection == 5) {
                break;
            }

            if (selection == 4) {
                displayData(fahrenheitArray, celsiusArray, kelvinArray, count);
                continue;
            }

            String tempType = "";
            if (selection == 1) {
                tempType = "Fahrenheit";
            } else if (selection == 2) {
                tempType = "Celsius";
            } else if (selection == 3) {
                tempType = "Fahrenheit";
            }

            double temperature = getTemperature(scanner, tempType);
            if (selection == 1) {
                fahrenheitArray[count] = temperature;
                celsiusArray[count] = calcCelsius(temperature);
                kelvinArray[count] = calcKelvin(temperature);
            } else if (selection == 2) {
                celsiusArray[count] = temperature;
                fahrenheitArray[count] = calcFahrenheit(temperature);
                kelvinArray[count] = calcKelvin(fahrenheitArray[count]);
            } else if (selection == 3) {
                fahrenheitArray[count] = temperature;
                celsiusArray[count] = calcCelsius(temperature);
                kelvinArray[count] = calcKelvin(temperature);
            }
            count++;
        }

        displayData(fahrenheitArray, celsiusArray, kelvinArray, count);
        scanner.close();
    }

    public static int showMenu(Scanner scanner) {
        int selection;
        while (true) {
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Convert Fahrenheit to Kelvin");
            System.out.println("4. Display Data");
            System.out.println("5. Quit Program");
            System.out.print("Enter your selection (1-5): ");
            selection = scanner.nextInt();
            if (selection >= 1 && selection <= 5) {
                break;
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return selection;
    }

    public static double getTemperature(Scanner scanner, String tempType) {
        double temperature;
        while (true) {
            System.out.print("Enter temperature in " + tempType + ": ");
            temperature = scanner.nextDouble();
            if (tempType.equals("Fahrenheit") || tempType.equals("Celsius")) {
                break;
            } else {
                System.out.println("Invalid temperature type. Please try again.");
            }
        }
        return temperature;
    }

    public static double calcCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32.0);
    }

    public static double calcFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double calcKelvin(double fahrenheit) {
        return calcCelsius(fahrenheit) + 273.15;
    }

    public static void displayData(double[] fahrenheitArr, double[] celsiusArr,
                                   double[] kelvinArr, int count) {
        if (count == 0) {
            System.out.println("No temperature data to display.");
            return;
        }
        System.out.printf("%-12s %-12s %-12s%n", "Fahrenheit", "Celsius", "Kelvin");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-12.2f %-12.2f %-12.2f%n",
                    fahrenheitArr[i], celsiusArr[i], kelvinArr[i]);
        }
    }
}

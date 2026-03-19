// this is a menu driven program to convert temperature from fahrenheit to celsius and kelvin and vice versa. The program will calculate the conversions according to the user's choice and store the last conversion values. The user can also choose to display the last conversion data or exit the program. If an invalid choice is made, the program will prompt the user to try again. The program will continue to run until the user chooses to exit.

public class ConvertF_C_K {
    public static void main(String[] args) {
        // code to control the program and take user input
        int choice;
        // variables to hold last conversion values
        double lastFahrenheit = 0;
        double lastCelsius = 0;
        double lastKelvin = 0;
        boolean hasData = false;

        do {
            choice = showMenu();
            switch (choice) {
                case 1:
                    double fahrenheit = getTemperature("Fahrenheit");
                    double celsius = calcCelsius(fahrenheit);
                    double kelvin = calcKelvin(fahrenheit);
                    // store results but do not display
                    lastFahrenheit = fahrenheit;
                    lastCelsius = celsius;
                    lastKelvin = kelvin;
                    hasData = true;
                    break;
                case 2:
                    double celsiusInput = getTemperature("Celsius");
                    double fahrenheitOutput = calcFahrenheit(celsiusInput);
                    kelvin = calcKelvin(fahrenheitOutput);
                    // store results but do not display
                    lastFahrenheit = fahrenheitOutput;
                    lastCelsius = celsiusInput;
                    lastKelvin = kelvin;
                    hasData = true;
                    break;
                case 3:
                    fahrenheit = getTemperature("Fahrenheit");
                    kelvin = calcKelvin(fahrenheit);
                    celsius = calcCelsius(fahrenheit);
                    // store results but do not display
                    lastFahrenheit = fahrenheit;
                    lastCelsius = celsius;
                    lastKelvin = kelvin;
                    hasData = true;
                    break;
                case 4:
                    if (hasData) {
                        displayData(lastFahrenheit, lastCelsius, lastKelvin);
                    } else {
                        System.out.println("No conversion data available. Please perform a conversion first.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public static int showMenu() {
        // code to display the menu and return the user's choice
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println("3. Convert Fahrenheit to Kelvin");
        System.out.println("4. Display Data");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    public static double getTemperature(String tempType) {
        // code to prompt the user for the temperature value and return it
        System.out.print("Enter the temperature in " + tempType + ": ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double calcCelsius(double fahrenheit) {
        // code to convert fahrenheit to celsius and return the value
        return (fahrenheit - 32) * 5/9;
    }

    public static double calcFahrenheit(double celsius) {
        // code to convert celsius to fahrenheit and return the value
        return (celsius * 9/5) + 32;
    }

    public static double calcKelvin(double fahrenheit) {
        // code to convert fahrenheit to kelvin and return the value
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static void displayData(double fahrenheit, double celsius, double kelvin) {
        // code to display all three temperature types in a formatted manner
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Celsius: %.2f\n", celsius);
        System.out.printf("Kelvin: %.2f\n", kelvin);
    }
    
}

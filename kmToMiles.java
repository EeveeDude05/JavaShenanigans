// this program converts kilometers to miles and will catch an exception if the user enters a non-numeric value.
import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter a distance in kilometers:");
        String input = new java.util.Scanner(System.in).nextLine();
        // if user inputs a non-numeric or negative value, the program will catch the exception and display an error message.
        try {
            double km = Double.parseDouble(input);
            if (km < 0) {
                System.out.println("Error: Please enter a non-negative value for kilometers.");
            } else {
                double miles = km * 0.621371;
                System.out.println(km + " kilometers is equal to " + miles + " miles.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric value for kilometers.");
        } finally {
            System.out.println("Thank you for using the km to miles converter.");
        }

    }
}
// This program prompts the user for the length of the string and angle of elevation and outputs the height of hte kite

import java.util.Scanner;

public class flyingkite {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of the string: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the angle of elevation (in degrees): ");
            double angle = scanner.nextDouble();

            // Convert angle to radians
            double angleInRadians = Math.toRadians(angle);

            // Calculate the height of the kite
            double height = length * Math.sin(angleInRadians);

            System.out.println("The height of the kite is: " + height);
        }
    }
}

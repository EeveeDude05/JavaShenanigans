//this program will calculate the height of a building using the angle of elevation and the distance from the building

import java.util.Scanner;
public class BuildingHight {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the distance from the building: ");
            double distance = scanner.nextDouble();

            System.out.print("Enter the angle of elevation (in degrees): ");
            double angle = scanner.nextDouble();

            // Convert angle to radians
            double angleInRadians = Math.toRadians(angle);

            // Calculate the height of the building
            double height = distance * Math.tan(angleInRadians);

            System.out.println("The height of the building is: " + height);
        }
    }
    
}

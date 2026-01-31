import java.util.Scanner;
// Author:
// Date: Jan 30, 2026
// Develop a program to calculate the gravity based on the following formula: g = G * M / (R * R). where g is gravity, G the gravitational constant, M mass and R the planets radius. The Gravitational constant’s value is 0.0000000000667. The user will input the diameter of the planet and its mass. The program will then output the gravity of the planet. Output will appear similar to the example file: outputExample_ProjectMoonBase.png

public class ProjectMoonBase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Gravitational constant
            final double G = 0.0000000000667;

            // Mass values for Earth, Moon, and Mars
            final double massEarth = 5.9736e24; // Mass of Earth in kg
            final double massMoon = 7.346e22; // Mass of Moon in kg
            final double massMars = 6.4169e23; // Mass of Mars in kg

            // Prompt user for diameter of Earth
            System.out.print("Enter the diameter of Earth in meters: ");
            double diameterEarth = scanner.nextDouble();

            // Prompt user for diameter of Moon
            System.out.print("Enter the diameter of the Moon in meters: ");
            double diameterMoon = scanner.nextDouble();

            // Prompt user for diameter of Mars
            System.out.print("Enter the diameter of Mars in meters: ");
            double diameterMars = scanner.nextDouble();

            // Calculate gravity for each celestial body
            double gravityEarth = G * massEarth / (diameterEarth / 2 * diameterEarth / 2);
            double gravityMoon = G * massMoon / (diameterMoon / 2 * diameterMoon / 2);
            double gravityMars = G * massMars / (diameterMars / 2 * diameterMars / 2);

            // Output the results
            System.out.printf("The gravity of Earth is: %.6f m/s²\n", gravityEarth);
            System.out.printf("The gravity of the Moon is: %.6f m/s²\n", gravityMoon);
            System.out.printf("The gravity of Mars is: %.6f m/s²\n", gravityMars);
        }
    }
}

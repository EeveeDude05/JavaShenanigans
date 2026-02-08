// this program demonstrates the converse of the pythagorean theorem using user input
// user inputs 3 numbers that the computer will then determine if the triangle is a right triangle and if so, solve it using the pythagrean theorem

import java.util.Arrays;
import java.util.Scanner;

public class ConversePythagorean {
    public static void main (String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter the lengths of the three sides of the triangle with spaces between each entry:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // Experiment : sort the sides so that the longest side is last
        double[] sides = {a, b, c};
        Arrays.sort(sides);
        
        // check if the triangle is a right triangle using the converse of the pythagorean theorem
        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
            System.out.println("The triangle is a right triangle.");
            // calculate the area of the triangle using the two shorter sides
            double area = 0.5 * sides[0] * sides[1];
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The triangle is not a right triangle.");
        }
    }
    }
}
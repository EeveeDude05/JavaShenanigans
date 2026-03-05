// This code will accept manually inputted grades via user input and then will calculate how many of those grades are passing or failing and determine a passing rate for the class. A passing grade is defined as a grade of 65 or higher.

import java.util.Scanner;

public class gradescopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many grades do you want to enter? ");
        int totalGrades = scanner.nextInt();
        
        int passingGrades = 0; // Counter for passing grades

        for (int i = 0; i < totalGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            int grade = scanner.nextInt();

            if (grade >= 65) {
                passingGrades++; // Increment the counter if the grade is passing
            }
        }

        double passingRate = (double) passingGrades / totalGrades * 100; // Calculate the passing rate

        System.out.println("\nTotal Grades: " + totalGrades);
        System.out.println("Passing Grades: " + passingGrades);
        System.out.println("Passing Rate: " + String.format("%.2f", passingRate) + "%");
        
        scanner.close();
    }
    
}

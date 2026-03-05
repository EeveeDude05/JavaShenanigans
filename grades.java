// This code will generate a series of randomly generated grades via a loop and then will calculate how many of those grades are passing or failing and determine a passing rate for the class. A passing grade is defined as a grade of 65 or higher.

public class grades {
    public static void main(String[] args) {
        int totalGrades = 20; // Total number of grades to generate
        int passingGrades = 0; // Counter for passing grades

        for (int i = 0; i < totalGrades; i++) {
            int grade = (int) (Math.random() * 101); // Generate a random grade between 0 and 100

            if (grade >= 65) {
                passingGrades++; // Increment the counter if the grade is passing
            }
        }

        double passingRate = (double) passingGrades / totalGrades * 100; // Calculate the passing rate

        System.out.println("Total Grades: " + totalGrades);
        System.out.println("Passing Grades: " + passingGrades);
        System.out.println("Passing Rate: " + String.format("%.2f", passingRate) + "%");
    }
    
}

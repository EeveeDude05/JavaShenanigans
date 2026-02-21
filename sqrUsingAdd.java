// This program calculates the square of a user inputted number using addition and displays the addition process. 
import java.util.Scanner;

public class sqrUsingAdd {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num >= 0) {
                int sum = 0;
                if (num == 0) {
                    System.out.println("0 = 0");
                    System.out.println("Square of 0 is 0");
                } else {
                    for (int i = 0; i < num; i++) {
                        int prev = sum;
                        sum += num;
                        System.out.println(prev + " + " + num + " = " + sum);
                    }
                    System.out.println("Square of " + num + " is " + sum);
                }
            } else {
                int square = num * num;
                System.out.println("Number is negative; using multiplication: " + num + " * " + num + " = " + square);
            }
            // ask the user if they want to calculate another square (y, Y for yes, n, N for no; handle invalid input by asking again)
            System.out.print("Do you want to calculate another square? (y/n): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("y")) {
                main(args); // call main method again to restart the process
            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("Goodbye...");
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
                // ask again until valid input is received
                while (true) {
                    System.out.print("Do you want to calculate another square? (y/n): ");
                    response = scanner.next();
                    if (response.equalsIgnoreCase("y")) {
                        main(args); // call main method again to restart the process
                        break;
                    } else if (response.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye...");
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter 'y' or 'n'.");
                    }
                }
            }
        }
    }
}

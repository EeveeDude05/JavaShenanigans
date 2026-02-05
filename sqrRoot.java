import java.util.Scanner;

public class sqrRoot {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to find its square root: ");
            double n = input.nextDouble();
            if(n >= 0) {
                double sqrt = Math.sqrt(n);
                System.out.println("The square root of " + n + " is: " + sqrt);
            }
            else {
                System.out.println("Cannot calculate the square root of a negative number.");
            }
        }
    }
}

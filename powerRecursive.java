// the programe calculates x^y using recursion and two user inputs, x and y.
import java.util.Scanner;

public class powerRecursive {
    public static double power(double x, int y) {
        // base case
        if (y == 0) {
            return 1;
        }
        // recursive case for positive exponent
        else if (y > 0) {
            return x * power(x, y - 1);
        }
        // recursive case for negative exponent
        else {
            return 1 / power(x, -y);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        double x = input.nextDouble();
        System.out.print("Enter the exponent (y): ");
        int y = input.nextInt();
        System.out.println(x + " raised to the power of " + y + " is: " + power(x, y));
    }
    
}

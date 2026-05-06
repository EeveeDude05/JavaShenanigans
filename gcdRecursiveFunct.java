// This program will divide the numerator and denominator by their greatest common divisor to simplify the fraction. The greatest common divisor is calculated using a recursive function.

import java.util.Scanner;

public class gcdRecursiveFunct {
    public static int gcd(int x, int y) {
        // base case
        if (y == 0) {
            return x;
        }
        // recursive case
        else {
            return gcd(y, x % y);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int num2 = input.nextInt();
        System.out.print("Enter the denominator: ");
        int num1 = input.nextInt();
        int result = gcd(num1, num2);
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + result);
        System.out.println("The simplified fraction is: " + (num2 / result) + "/" + (num1 / result));
    }
}

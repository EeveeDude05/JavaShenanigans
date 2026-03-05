// This code will calculate the Fibonacci sequence up to a certain number of terms specified by the user and store the sequence in an array.

import java.util.Scanner;

public class fibinacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Fibonacci terms do you want? ");
        int n = scanner.nextInt(); // Number of terms in the Fibonacci sequence
        int[] fib = new int[n];

        // Initialize the first two terms of the Fibonacci sequence
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }

        // Calculate the Fibonacci sequence and store it in the array
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print the Fibonacci sequence
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        
        scanner.close();
    }
    
}

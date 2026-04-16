// This program will create an array of the fibanocci sequence. Then it will ask the user for the index and print out the value at that index. If the user enters an index that is out of bounds, it will catch the exception and print an error message.
public class FirstExeption {
    public static void main(String[] args) {
        int[] fib = new int[20];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("Enter an index to get the Fibonacci number:");
        int index = new java.util.Scanner(System.in).nextInt();
        try {
            System.out.println("The Fibonacci number at index " + index + " is: " + fib[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter an index between 0 and " + (fib.length - 1));
        }

    }
}

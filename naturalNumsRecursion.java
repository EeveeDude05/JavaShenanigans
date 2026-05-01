// print natural numbers from 1 to n using recursion

public class naturalNumsRecursion {
    public static void printNaturalNumbers(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // recursive case
        printNaturalNumbers(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 100; // change this value to print natural numbers up to different n
        System.out.println("Natural numbers from 1 to " + n + ":");
        printNaturalNumbers(n);
    }
    
}

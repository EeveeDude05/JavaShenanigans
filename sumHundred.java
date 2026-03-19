//This progaram adds up the numbers 1 - 100

public class sumHundred {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of the numbers from 1 to 100 is: " + sum);
    }
}

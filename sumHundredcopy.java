//This progaram adds up the numbers 1 - 100

public class sumHundredcopy {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;
        while (counter <= 100) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum of the numbers from 1 to 100 is: " + sum);
    }
}

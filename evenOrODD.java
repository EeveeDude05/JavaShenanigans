// This program checks if a number is even or odd based on user input
import java.util.Scanner;

public class evenOrODD {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
    }
}
//jlgdgfdj;vasufnkdffbks  

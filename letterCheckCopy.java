//This program asks the user to input a letter and checks if it is lowercase, uppercase, or not a letter at all
import java.util.Scanner;

public class letterCheckCopy {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a letter: ");
            char letter = scanner.next().charAt(0);

                        if (letter >= 'a' && letter <= 'z') {
                            System.out.println("The letter is lowercase.");
                        } else if (letter >= 'A' && letter <= 'Z') {
                            System.out.println("The letter is uppercase.");
                        } else {
                            System.out.println("The input is not a letter.");
                        }
                    }
                }
            }

// this program will prompt the user for a daily temperature and until the user enters -200 to stop. then the program will print the highest temperatures entered.

import java.util.Scanner;
public class Tempurtue {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int temp;
            int highestTemp = Integer.MIN_VALUE; // Initialize to the smallest possible integer
            
            System.out.println("Enter daily temperatures (enter -200 to stop):");
            
            while (true) {
                temp = input.nextInt();
                if (temp == -200) {
                    break; // Exit the loop if the user enters -200
                }
                if (temp > highestTemp) {
                    highestTemp = temp; // Update highest temperature if current temp is greater
                }
            }
            
            if (highestTemp == Integer.MIN_VALUE) {
                System.out.println("No temperatures were entered.");
            } else {
                System.out.println("The highest temperature entered was: " + highestTemp);
            }
        }
    }
}
//This program calculates the average of 7 temperatures entered by the user one for every day of the week. and then additionally displays the highest and lowest temperatures entered by the user.

import java.util.Scanner;

public class averageTemps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = new int[7];
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.println("Enter the temperature for each day of the week:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
            sum += temperatures[i];

            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }

            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }

        int average = sum / 7;

        System.out.println("Average temperature: " + average);
        System.out.println("Highest temperature: " + highest);
        System.out.println("Lowest temperature: " + lowest);
    }
}

// Tests whether a 3x3 array of integers is a magic square, meaning that the sum of each row, column, and diagonal is the same. The design should follow the VTOC below. Declare your array in main. Design a method for inputting the array. Get one whole row at a time from the user. Design a method for testing the array as a magic square. This method should return a Boolean true if it is a magic square. Inform the user accordingly and then ask if the user wants to repeat the algorithm. Use appropriately designed and worded prompts. use entervalues method to get the values for the array and testArray metheod to test if the array is a magic square. utilize the main method to control the flow of the program and call the necessary methods for input and testing.

import java.util.Scanner;

public class magicsquare {
    public static void main(String[] args) {
        int[][] square = new int[3][3];
        boolean repeat;

        do {
            fillArray(square);
            if (testArray(square)) {
                System.out.println("The array is a magic square!");
            } else {
                System.out.println("The array is not a magic square.");
            }

            repeat = askToRepeat();
        } while (repeat);
    }

    public static void fillArray(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int r = 0; r < array.length; r++) {
            System.out.print("Enter 3 integers for row " + (r + 1) + " separated by spaces: ");
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = scanner.nextInt();
            }
        }
    }

    public static boolean testArray(int[][] array) {
        int magicSum = 15; // The magic sum for a 3x3 magic square

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += array[i][j];
                colSum += array[j][i];
            }
            if (rowSum != magicSum || colSum != magicSum) {
                return false;
            }
        }

        // Check diagonals
        int diag1Sum = array[0][0] + array[1][1] + array[2][2];
        int diag2Sum = array[0][2] + array[1][1] + array[2][0];

        return diag1Sum == magicSum && diag2Sum == magicSum;
    }

    public static boolean askToRepeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to test another square? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return response.equals("yes");
    }


    
}

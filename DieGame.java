public class DieGame {
    public static void main(String[] args) {
        // create an array of 10 dice with 6 sides
        Die[] dice = new Die[10];
        int[] rolls = new int[10];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(6);
            rolls[i] = dice[i].roll();
            // roll each die and print the result
            System.out.println("Rolling die " + (i + 1) + ": " + rolls[i]);
        }
        // generate an ascii art representation of the dice rolls
        System.out.println("\nASCII Art Representation of Dice Rolls:");
        for (int i = 0; i < dice.length; i++) {
            System.out.println("Die " + (i + 1) + ": " + "\n" + getAsciiArt(rolls[i]));
        }
        // determine the highest roll (winner) and print it accounting for ties
        int highestRoll = 0;
        for (int roll : rolls) {
            if (roll > highestRoll) {
                highestRoll = roll;
            }
        }
        System.out.println("\nThe highest roll is " + highestRoll);
        System.out.println("Winner(s):");
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == highestRoll) {
                System.out.println("Die " + (i + 1));
            }
        }

    }

    private static String getAsciiArt(int roll) {
        return switch (roll) {
            case 1 -> "[     ]\n[  o  ]\n[     ]";
            case 2 -> "[o    ]\n[     ]\n[    o]";
            case 3 -> "[o    ]\n[  o  ]\n[    o]";
            case 4 -> "[o   o]\n[     ]\n[o   o]";
            case 5 -> "[o   o]\n[  o  ]\n[o   o]";
            case 6 -> "[o   o]\n[o   o]\n[o   o]";
            default -> "[?????]";
        };
    }
}
        

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Write a program that prompts the user to enter the year and name. Output should then display the ranking of that name for that year.
// Program should ask if user wishes to enter another year and name. Program should also terminate program based on a user’s decision to continue.
// There will be 6 files to choose from: babynamesranking2005.txt through babynamesranking2010.txt.
public class babyNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Enter the year (2005-2010): ");
            int year;
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } else {
                System.out.println("Invalid year. Please enter a number between 2005 and 2010.");
                scanner.nextLine(); // discard invalid input
                continue;
            }

            if (year < 2005 || year > 2010) {
                System.out.println("Year must be between 2005 and 2010.");
                continue;
            }

            System.out.print("Enter the name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name cannot be blank. Please try again.");
                continue;
            }

            displayRanking(year, name);

            System.out.print("Do you want to enter another year and name? (yes/no): ");
            String choice = scanner.nextLine().trim();
            continueProgram = choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y");
        }

        scanner.close();
    }

    public static void displayRanking(int year, String name) {
        String filename = "babynamesranking" + year + ".txt";
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("Data file for year " + year + " is not available.");
            return;
        }

        boolean found = false;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] tokens = line.split("\\s+");
                if (tokens.length < 4) {
                    continue;
                }

                String rank = tokens[0];
                String maleName = tokens[1];
                String femaleName = tokens[3];

                if (name.equalsIgnoreCase(maleName)) {
                    System.out.println(name + " is ranked #" + rank + " in " + year + " for boys.");
                    found = true;
                    break;
                }

                if (name.equalsIgnoreCase(femaleName)) {
                    System.out.println(name + " is ranked #" + rank + " in " + year + " for girls.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(name + " is not ranked in the top 1000 baby names for " + year + ".");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file: " + filename);
        }
    }
}

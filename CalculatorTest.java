import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            String result = calc.parseInput(input);
            if (!result.isEmpty()) {
                System.out.println(result);
            }
        }
        scanner.close();
    }
}
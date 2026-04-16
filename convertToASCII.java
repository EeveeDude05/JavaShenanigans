// Write a Java program that takes a string as input and converts each character to its corresponding ASCII value, then prints the ASCII values in a comma-separated format. Example input: "Got me a nice cup of joe"

public class convertToASCII {
    public static void main(String[] args) {
        String input = "Got me a nice cup of joe"; // example input
        String asciiValues = convertToASCIIValues(input);
        System.out.println(asciiValues);
    }

    public static String convertToASCIIValues(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append((int) c);
            if (i < str.length() - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }
}

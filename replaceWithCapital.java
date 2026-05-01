// Write a Java program that takes a string as input and replaces the first lowercase letters in each word with their uppercase counterparts.
public class replaceWithCapital {
    public static void main(String[] args) {
        String input = "hello world this is a test"; // example input
        String output = replaceFirstLowercaseWithUppercase(input);
        System.out.println(output);
    }

    public static String replaceFirstLowercaseWithUppercase(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                if (Character.isLowerCase(firstChar)) {
                    firstChar = Character.toUpperCase(firstChar);
                }
                result.append(firstChar).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }
    
}

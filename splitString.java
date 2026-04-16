// Write a Java program that takes a string as input and splits it into an array of words, then prints each word on a new line. Example input: "Chicken Tacos are delicious"
public class splitString {
    public static void main(String[] args) {
        String input = "Chicken Tacos are delicious"; // example input
        String[] words = input.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}

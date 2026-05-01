// this will split the string into 2 parts and print them out

public class splitstrings {
    public static void main(String[] args) {
        String str = "ChickenTacos"; // string to split
        int splitIndex = 7; // index to split the string

        String part1 = str.substring(0, splitIndex);
        String part2 = str.substring(splitIndex);

        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
    }
}

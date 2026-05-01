// this program will reverse the characters in a string using recursion

public class ReverseChar {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.print("Reversed string: ");
        reverse(str);
        System.out.println();
    }

    public static void reverseDisplay(String str) {
        if (str.isEmpty()) {
            return;
        }
        System.out.print(str.charAt(str.length() - 1));
        reverseDisplay(str.substring(0, str.length() - 1));
    }

    public static void reverse(String str) {
        if (str.isEmpty()) {
            return;
        }
        System.out.print(str.charAt(str.length() - 1));
        reverse(str.substring(0, str.length() - 1));
    }
}

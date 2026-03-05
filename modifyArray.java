public class modifyArray {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    //returns the smallest element in the array
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}

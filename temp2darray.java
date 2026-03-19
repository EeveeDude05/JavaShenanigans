// uses a 2D array to store high and low temperatures for a week, calculates average, highest, and lowest temperatures, and displays the results in a formatted table. 
public class temp2darray {
    // calls the list of temperatures for use by the other methods
    public static void main(String[] args) {
        int[][] temperature = {
            {72, 42},
            {74, 41},
            {53, 29},
            {46, 27},
            {48, 29},
            {45, 28},
            {56, 32}
        }; 
        // Print out the temperatures in the array (sideways with day labels)
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < temperature.length; i++) {
            System.out.println(days[i] + ": High = " + temperature[i][0] + ", Low = " + temperature[i][1]);
        }
        // 
    }
}
        
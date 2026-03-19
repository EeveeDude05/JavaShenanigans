public class TempHighLowAverage {
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
        
        // Print day headers
        System.out.print(String.format("%-10s", ""));
        for (int r = 0; r < temperature.length; r++) {
            System.out.print(String.format("%-10s", days[r]));
        }
        System.out.print(String.format("%-10s", "Average"));
        System.out.print(String.format("%-10s", "Highest/Lowest"));
        System.out.println();
        
        // Print High temperatures
        System.out.print(String.format("%-10s", "High:"));
        for (int r = 0; r < temperature.length; r++) {
            System.out.print(String.format("%-10s", temperature[r][0]));
        }
        // Calculate and print average for highs
        double sumHigh = 0;
        int maxHigh = Integer.MIN_VALUE;
        for (int r = 0; r < temperature.length; r++) {
            sumHigh += temperature[r][0];
            if (temperature[r][0] > maxHigh) {
                maxHigh = temperature[r][0];
            }
        }

        double avgHigh = sumHigh / temperature.length;
        System.out.print(String.format("%-10.1f", avgHigh));
        System.out.print(String.format("%-10s", maxHigh));
        System.out.println();
        
        // Print Low temperatures
        System.out.print(String.format("%-10s", "Low:"));
        for (int r = 0; r < temperature.length; r++) {
            System.out.print(String.format("%-10s", temperature[r][1]));
        }
        // Calculate and print average for lows
        double sumLow = 0;
        int minLow = Integer.MAX_VALUE;
        for (int r = 0; r < temperature.length; r++) {
            sumLow += temperature[r][1];
            if (temperature[r][1] < minLow) {
                minLow = temperature[r][1];
            }
        }
        double avgLow = sumLow / temperature.length;
        System.out.print(String.format("%-10.1f", avgLow));
        System.out.print(String.format("%-10s", minLow));
        System.out.println();
        
        // Test sum2DArray() method - calculate average temperature for the week
        System.out.println("\n--- Testing sum2DArray() Method ---");
        int totalSum = sum2DArray(temperature);
        int totalElements = temperature.length * temperature[0].length;
        double weekAverage = (double) totalSum / totalElements;
        System.out.println("Total sum of all temperatures: " + totalSum);
        System.out.println("Total number of temperatures: " + totalElements);
        System.out.println("Average temperature for the week: " + String.format("%.1f", weekAverage));
        
        // Test transpose() method
        System.out.println("\n--- Testing transpose() Method ---");
        int[][] transposed = transpose(temperature);
        System.out.println("Original array:");
        print2DArray(temperature);
        System.out.println("Transposed array:");
        print2DArray(transposed);
    }
    
        // Method to calculate the sum of all elements in a 2D array
        public static int sum2DArray(int[][] array) {
            int sum = 0;
            for (int r = 0; r < array.length; r++) {
                for (int c = 0; c < array[r].length; c++) {
                    sum += array[r][c];
                }
            }
            return sum;
        }
        
        // Method to transpose a 2D array (rows become columns)
        public static int[][] transpose(int[][] array) {
            if (array == null || array.length == 0) {
                return new int[0][0];
            }
            int rows = array.length;
            int cols = array[0].length;
            int[][] result = new int[cols][rows];
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    result[c][r] = array[r][c];
                }
            }
            return result;
        }
        
        // Helper to print a 2D array
        public static void print2DArray(int[][] array) {
            for (int[] row : array) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

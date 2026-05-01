import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Customer {
    public static void main(String[] args) {
        File f = new File("customer.txt");
        try {
            PrintWriter output = new PrintWriter(f);
            // write some really awesome songs to the file
            output.print("Stuck in Your Head - I Prevail\n");
            output.print("Mind is a Prison - Alec Benjamin\n");
            output.print("The Fate of Ophilia - Taylor Swift\n");
            output.print("Picking up the Pieces - Blue October\n");
            output.print("Numb - Linkin Park\n");
            output.print("The Sound of Silence - Disturbed\n");
            output.print("Numb - Marshmello\n");

            output.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        System.out.println("Customer file created and songs written successfully.");
    }
}
        

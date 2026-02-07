// Aiden Volf
// Program 3A
// 2/6/26
// This program will write and test an algorithm to determine which of several planets a spacecraft is currently located at based on the gravitational force it experiences. The instrument has an accuracy of + or - 0.25 due to heat and cold conditions. This program will use 9.795 for Earth's gravity, 1.623 for the Moon, and 3.711 for Mars. The program will compare the gravity values above to a randomly generated value between 0 and 10.5 and create a decision statement to output the name of  the planet.
//EDIT: the program is updated to use the BigDecimal class for more precise calculations and to account for the accuracy range of the instrument.

import java.math.BigDecimal;

public class Program3A {
    public static void main(String[] args) {
        // Generate a random gravity value between 0 and 10.5 using BigDecimal
        BigDecimal gravity = new BigDecimal(Math.random()).multiply(new BigDecimal("10.5"));
        System.out.println("Measured gravity: " + gravity);

        // Define gravity ranges with BigDecimal for precision
        BigDecimal earthMin = new BigDecimal("9.545");
        BigDecimal earthMax = new BigDecimal("10.045");
        BigDecimal moonMin = new BigDecimal("1.373");
        BigDecimal moonMax = new BigDecimal("1.873");
        BigDecimal marsMin = new BigDecimal("3.600");
        BigDecimal marsMax = new BigDecimal("3.850");

        if (gravity.compareTo(earthMin) >= 0 && gravity.compareTo(earthMax) <= 0) { // Earth's gravity with accuracy range
            System.out.println("The spacecraft is on Earth.");
        } else if (gravity.compareTo(moonMin) >= 0 && gravity.compareTo(moonMax) <= 0) { // Moon's gravity with accuracy range
            System.out.println("The spacecraft is on the Moon.");
        } else if (gravity.compareTo(marsMin) >= 0 && gravity.compareTo(marsMax) <= 0) { // Mars' gravity with accuracy range
            System.out.println("The spacecraft is on Mars.");
        } else {
            System.out.println("The spacecraft is in an unknown location.");
        }
    }
    
}

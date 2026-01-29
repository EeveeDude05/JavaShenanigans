// Author: Chicken Nuggets
// 1/29/2026
// This program will calculate the volume of a cylinder using radius and height.

public class cylinderVolume {
    public static void main(String[] args)
    {
        // variables
        double radius = 5.0;
        double height = 10.0;
        double volume;

        // calculate volume
        // volume = π * r² * h
        volume = Math.PI * Math.pow(radius, 2) * height;
        
        // output results
        System.out.println("Volume = " + volume + " units³");
    }
}

// Author: Chicken Nuggets
// 1/29/2026
// This will collect input from the user and calculate the volume of a cylinder.

import java.util.Scanner;

public class CylinderVolumeinput {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the radius of the cylinder: ");
            double radius = input.nextDouble();
            
            System.out.print("Enter the height of the cylinder: ");
            double height = input.nextDouble();
            
            double volume = Math.PI * Math.pow(radius, 2) * height;
            
            System.out.println("Volume = " + volume + " units³");
        }
    }
}
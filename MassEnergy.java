// Author : Chicken Nuggets
// 1/29/2026
// This program will prompt the user for the mass of an object and calculate the energy in joules using Einstein's equation E=mc²

import java.util.Scanner;
public class MassEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the mass of the object (in kg): ");
        int mass = input.nextInt();
        
        final int SPEED_OF_LIGHT = 299792458; // Speed of light in m/s
        double energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
        
        System.out.println("The energy of the object is: " + energy + " joules");
        input.close();
    }
}
 
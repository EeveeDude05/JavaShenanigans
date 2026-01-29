// Author : Chicken Nuggets
// 1/29/2026
// This will calculate the volume of a cube using user inputted values.

import java.util.Scanner;
public class CubeVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of one side of the cube: ");
        double sideLength = input.nextDouble();
        
        double volume = Math.pow(sideLength, 3);
        
        System.out.println("Volume = " + volume + " units³");
    }

    
}

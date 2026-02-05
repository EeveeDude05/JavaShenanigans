// This program grab the volume of a cylinder

public class cylinder {
    public static void main(String[] args) {
        double radius = 4;
        double height = 5; 

        //if redius and or height is greater than 0, then calculate the volume of the cylinder
        if (radius > 0 && height > 0) {
            double volume = Math.PI * Math.pow(radius, 2) * height;

            System.out.println("The volume of the cylinder is: " + volume);
        }
        else {
            System.out.println("Radius and height must be greater than 0.");
        }
    }
}
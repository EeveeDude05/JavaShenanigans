// Define a sphere class with properties and methods to calculate radius, surface area and volume

public class SphereClass {
    private double radius;

    public SphereClass(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
    public static void main(String[] args) {
        SphereClass sphere = new SphereClass(5.0);
        System.out.println("Radius: " + sphere.getRadius());
        System.out.println("Surface Area: " + sphere.getSurfaceArea());
        System.out.println("Volume: " + sphere.getVolume());
    }
}
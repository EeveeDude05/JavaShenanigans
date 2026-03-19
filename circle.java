public class circle {
    // data fields
    private double radius;

    // methods
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
        }
public static void main(String[] args) {
        circle c1 = new circle();
        c1.setRadius(5.0);

        System.out.println("Circle with radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
    }
}
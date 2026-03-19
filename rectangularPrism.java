// this program will use the private data fields double width, length, and height and  to get the volume and surface area of a rectangular prism. The private data fields will collect data from the user to plug into the getVolume and getSurfaceArea methods. The main method will control the flow of the program and call the necessary methods for input and calculations.

public class rectangularPrism {
    private double width;
    private double length;
    private double height;


// sets the values for the data fields and assigns them a number for the calculations in the getVolume and getSurfaceArea methods 

    // default constructor (all values start at 0)
    public rectangularPrism() {
        this.width = 0;
        this.length = 0;
        this.height = 0;
    }

    // constructor using values provided by caller
    public rectangularPrism(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // setters for separate value assignment before calculation
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDimensions(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // getters in case caller needs individual values
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return width * length * height;
    }

    public double getSurfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }

    public static void main(String[] args) {
        rectangularPrism prism1 = new rectangularPrism(2.0, 3.0, 4.0);
        System.out.println("Rectangular Prism dimensions: " + prism1.getWidth() + " x " + prism1.getLength() + " x " + prism1.getHeight());
        System.out.println("Volume: " + prism1.getVolume());
        System.out.println("Surface area: " + prism1.getSurfaceArea());
    }
}
 
//Author: Chicken Nuggets
//1/29/2026
//This program will calculate BMI using weight in pound and height in inches.

public class BMICalculator {
    public static void main(String[] args) {
        double weight = 15; // weight in pounds
        double height = 25; // height in inches
        
        // Calculate BMI
        // bmi = 703 * weight / height²
        double bmi = 703 * weight / (height * height);

        // TERRIBLE // 4 / 3 * 3.14 * radius;
        //                               Math.pow(Base, Exponent/Power)
        //                                    ˅˅˅˅˅˅˅˅˅˅˅˅
        // Fixed //  4.0 / 3 * MATH.PI * Math.pow(radius, 3);

        // Output the BMI
        System.out.println("BMI = " + bmi);


    }
    
}

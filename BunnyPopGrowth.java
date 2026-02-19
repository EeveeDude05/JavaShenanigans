//This program prompts the user for initial population time and growth rate and outs the population over a given time.
import java.util.Scanner;
public class BunnyPopGrowth {
    static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter initial population: ");
            int population = input.nextInt();
            System.out.print("Please enter growth rate: ");
            int growthRate = input.nextInt();
            System.out.print("Please enter the time elapsed: ");
            double time = input.nextDouble();

            //calculate population after t time
            int finalPopulation = population * (int)Math.pow(Math.E, growthRate * time);

            System.out.println("Population = " + finalPopulation);
        }




    }


}

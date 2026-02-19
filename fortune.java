//The program randomly selects an interger between 1-5 and outputs a fortune
public class fortune {
    public static void main(String[] args) {
        int fortune = (int)(Math.random() * 5) + 1;
        if (fortune == 1){
            System.out.println("You will have fun in java today");
        }
        else if (fortune == 2){
            System.out.println("You will be awarded greatly for your hard work");
        }
        else if (fortune == 3){
            System.out.println("You will score a good deal on a brand new car");
        }
        else if (fortune == 4){
            System.out.println("You will achieve the BEST ratio of PB and J on your sandwich tomorrow");
        }
        else if (fortune == 5){
            System.out.println("Send this to someone who deserves to perish and receive the best luck of your life");
        }
    }
}

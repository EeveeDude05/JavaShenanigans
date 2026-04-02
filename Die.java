public class Die {
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return (int)(Math.random() * sides) + 1;
    }

    public static void main(String[] args) {
        Die die = new Die(6);
        System.out.println("Rolling a " + die.getSides() + "-sided die: " + die.roll());
    }
}
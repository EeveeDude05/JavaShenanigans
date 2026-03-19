//this program will select 3 words from a set of business related words and combine them to make a new phrase

public class phraseOmatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric"};
        String[] wordListThree = {"process", "solution", "tipping-point", "strategy", "vision"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
    
}

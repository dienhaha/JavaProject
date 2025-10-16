package exercise5;

import java.util.Random;

public class Die {
    //DATA MEMBER
    private Random random;
    private int number = 0;

    //CONSTRUCTOR
    public Die() {
        random = new Random();
        number = 0;
    }

    //METHOD
    public void roll() {
        number = random.nextInt(1, 7);
    }

    public int getNumber() {
        return number;
    }

}

package game;

import java.util.Random;

public class Die {
    private int value;
    public String getValue;


    public int getValue() {
        return value;
    }

    public void throwDie() {
// static skal skride
        Random rand = new Random();
        // Numbers of sides on the Die is set below this line
        value = rand.nextInt(6) + 1;
    }
}

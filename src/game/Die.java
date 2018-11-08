package game;

import java.util.Random;

public class Die {

    private int value;

    public Die() {
    }

    public int throwDie() {
        // Numbers of sides on the Die is set below this line
       value = (int)(Math.random()*6+1);
       return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

package game;

import java.util.Random;

public class Die {

    private int value;
    public String getValue;

    public Die() {
    }
//TODO Check constructor

    public int getValue() {
        return value;
    }

    public int throwDie() {
        // Numbers of sides on the Die is set below this line
       int r = (int) (Math.random() * ( 6- 1)) + 1;;
       this.value = r;
       return value;
    }
}

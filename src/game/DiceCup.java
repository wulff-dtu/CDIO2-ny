package game;

public class DiceCup {private Die[] dice = {new Die(), new Die()};


    public int getValue() {
        int sum = 0;
        for (Die d : dice) {
            sum += d.getValue();
        }
        return sum;
    }

    public void printRolls() {
        for (Die d : dice) {
            System.out.print(d.getValue + " ");
        }
    }


    public void throwDice() {
        for (int i = 0; i < dice.length; i++) {
            dice[i].throwDie();
        }

    }
}


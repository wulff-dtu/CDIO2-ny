package game;

public class DiceCup {

    private Die[] dice;
    private int sum; //combined sum of the dice

    public DiceCup(int numOfDice) {
        dice = new Die[numOfDice];
        for(int i = 0; i < numOfDice; i++) {
            dice[i] = new Die();
        }
    }

    public int throwDice() {
        int accumlatedSum = 0;
        for (Die die : dice) {
            die.throwDie();
            accumlatedSum += die.getValue();
        }
        sum = accumlatedSum;
        return sum;
    }

    public int getSum() {
        return sum;
    }
}


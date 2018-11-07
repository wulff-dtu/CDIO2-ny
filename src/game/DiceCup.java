package game;

public class DiceCup {

    private Die[] dice;
    private int sum;

    public DiceCup(int numOfDice) {
        dice = new Die[numOfDice];
        for(int i = 0; i < numOfDice; i++) {
            dice[i] = new Die(6);
        }
    }

    //TODO add throwDice method.

    public void throwDice() {
        int accumulateSum = 0;
        for (Die die : dice) {
            die.throwDie();
            accumulateSum += die.getValue();
        }
        sum = accumulateSum;
    }

    public int getSum() {
        return sum;
    }
}

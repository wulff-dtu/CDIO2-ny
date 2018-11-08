package game;

public class DiceCup {

    private Die[] dice;
    private int sum;

    public DiceCup(int numOfDice) {
        dice = new Die[numOfDice];
        for(int i = 0; i < numOfDice; i++) {
            dice[i] = new Die();
            //TODO add constructor in Die class
        }
    }

    //TODO add throwDice method.
    //committed a suggestion to the throwDice method(mads)
    public int throwDice() {
        int diceSum = 0;

        for (int i = 0; i < dice.length; i++) {
            dice[i].throwDie();
            diceSum += dice[i].getValue();
        }

        return diceSum;
    }
}


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
        for (int i = 0; i < dice.length; i++) {
            dice[i].throwDie();
            sum += dice[i].getValue();
        }

        return sum;
    }
}


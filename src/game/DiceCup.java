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

    //TODO add throwDice method.//har kastet en throwDice ind fra mit forslag(mads)
    public void throwDice() {
        for (int i = 0; i < dice.length; i++) {
            dice[i].throwDie();}
        }

    public int getSum() {
        return sum;
    }
}


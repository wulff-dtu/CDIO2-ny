package game;
/*
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
}*/

//mads¨ forslag nedenunder

public class DiceCup {

private Die[] dice = {new Die(), new Die()};


    public int getValue() {
        int sum = 0;
        for (Die d : dice) {
            sum += d.getValue();
        }
        return sum;
    }
    // printRolls er egentlig bare en metode for getValue bare som string.
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

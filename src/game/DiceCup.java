package game;

public class DiceCup {
    private Die[] dice = {new Die(), new Die()};
// kan nemt ændre listen af ternigner der skal bruges i bæret.

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


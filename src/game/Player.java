package game;

public class Player {

    private String name;
    private Bankroll bankroll;

    public Player(String name) {
        this.name = name;
    }


    public Bankroll getBankroll() {
        return bankroll;
    }
/* denne funktion skal slettes - fungerer som placeholder for camilla te's dims*/
    public int ChangeBankRoll(int change){
        return change;

    }

}


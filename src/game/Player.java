package game;

public class Player {

    private String name;
    private Bankroll bankroll;

    public Player(String name) {
        this.name = name;
        bankroll = new Bankroll();
    }

    public Bankroll getBankroll() {
        return bankroll;
    }

    public String getName() {
        return name;
    }
/* denne funktion skal måske slettes - fungerer som placeholder for camilla te's dims
    public int getBankroll().adjustBalance(int change){
        return change;

    }*/

}


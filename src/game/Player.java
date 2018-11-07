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
}
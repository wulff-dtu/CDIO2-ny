package game;

public class Tile {

    private String message;
    private int effectOnBalance;
    private boolean grantsExtraTurn;

    public Tile(String message, int effectOnBalance, boolean grantsExtraTurn) {
        this.message = message;
        this.effectOnBalance = effectOnBalance;
        this.grantsExtraTurn = grantsExtraTurn;
    }

}

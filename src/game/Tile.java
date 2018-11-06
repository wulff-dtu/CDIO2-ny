package game;

public class Tile {

    private String message;
    private int effectOnBalace;
    private boolean grantsExtraTurn;

    public Tile(String message, int effectOnBalace, boolean grantsExtraTurn) {
        this.message = message;
        this.effectOnBalace = effectOnBalace;
        this.grantsExtraTurn = grantsExtraTurn;
    }

}

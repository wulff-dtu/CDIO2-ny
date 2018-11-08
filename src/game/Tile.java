package game;

public class Tile {

    private String messageID;
    private int effectOnBalance;
    private boolean grantsExtraTurn;

    public Tile(String messageID, int effectOnBalance, boolean grantsExtraTurn) {
        this.messageID = messageID;
        this.effectOnBalance = effectOnBalance;
        this.grantsExtraTurn = grantsExtraTurn;
    }

}

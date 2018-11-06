package game;

public class Tile {

    private String name;
    private int effectOnBalace;
    private boolean grantsExtraTurn;

    public Tile(String name, int effectOnBalace, boolean grantsExtraTurn) {
        this.name = name;
        this.effectOnBalace = effectOnBalace;
        this.grantsExtraTurn = grantsExtraTurn;
    }

}

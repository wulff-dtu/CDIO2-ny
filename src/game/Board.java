package game;

public class Board {

    private Tile[] tiles;

    public Board(int numberOfTiles) {
        this.tiles = new Tile[numberOfTiles];
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[] tiles) {
        this.tiles = tiles;
    }
}

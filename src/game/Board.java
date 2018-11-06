package game;

public class Board {

    private Tile[] tiles;

    public Board() {
        tiles = new Tile[11];
        tiles[0] = new Tile("Reference til string i language her", 250, false);
        tiles[0] = new Tile("Reference til string i language her", -100, false);
        tiles[0] = new Tile("Reference til string i language her", 100, false);
        tiles[0] = new Tile("Reference til string i language her", -20, false);
        tiles[0] = new Tile("Reference til string i language her", 180, false);
        tiles[0] = new Tile("Reference til string i language her", 0, false);
        tiles[0] = new Tile("Reference til string i language her", -70, false);
        tiles[0] = new Tile("Reference til string i language her", 60, false);
        tiles[0] = new Tile("Reference til string i language her", -80, true);
        tiles[0] = new Tile("Reference til string i language her", -50, false);
        tiles[0] = new Tile("Reference til string i language her", 650, false);
    }

    public Tile[] getTiles() {
        return tiles;
    }
}

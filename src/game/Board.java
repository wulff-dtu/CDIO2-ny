package game;

import UI.Language;

public class Board {

    private Tile[] tiles;

    public Board(Language language) {
        tiles = new Tile[12];
        tiles[0] = new Tile ("dummy tile", 0, false);
        tiles[1] = new Tile ("dummy tile", 0, false);
        tiles[2] = new Tile(language.getMessage("board_tower_message"), 250, false);
        tiles[3] = new Tile(language.getMessage("board_crater_message"), -100, false);
        tiles[4] = new Tile(language.getMessage("board_palace_gates_message"), 100, false);
        tiles[5] = new Tile(language.getMessage("board_cold_desert_message"), -20, false);
        tiles[6] = new Tile(language.getMessage("board_walled_city_message"), 180, false);
        tiles[7] = new Tile(language.getMessage("board_monastery_message"), 0, false);
        tiles[8] = new Tile(language.getMessage("board_black_cave_message"), -70, false);
        tiles[9] = new Tile(language.getMessage("board_huts_message"), 60, false);
        tiles[10] = new Tile(language.getMessage("board_werewall_message"), -80, true);
        tiles[11] = new Tile(language.getMessage("board_pit_message"), -50, false);
        tiles[12] = new Tile(language.getMessage("board_goldmine_message"), 650, false);
    }

    public Tile[] getTiles() {
        return tiles;
    }
}

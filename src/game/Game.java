package game;

import UI.MainMenu;

public class Game {

    private Player[] players;
    private Board board;
    private DiceCup diceCup;

    public Game() {
    }

    //Jeg har lige prøvet at få spillet til at køre, på den måde jeg lige kunne finde ud af. Kan sagtens ændres.
    public void runGame(String[] playerNames, Language language){

        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }

        board = new Board(language);
        diceCup = new DiceCup(2);
    }


    /**
     * Method that starts the game and is called by Main
     */
    public ? run() {
        //ender med et starte spil, vise regler, skifte sprog eller afslutte program
    }

    private void runTurn(Game game) {
        Turn turn = new Turn(player, game);
    }

    public DiceCup getDiceCup() {
        return diceCup;
    }

}
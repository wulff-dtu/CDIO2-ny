package game;

import UI.UI;

public class Game {

    private Player[] players;
    private Board board;
    private DiceCup diceCup;
    private UI ui;

    public Game() {
    }

    /**
     * Method that sets up the game. Called via main menu (UI).
     */
    //Jeg har lige prøvet at få spillet til at køre, på den måde jeg lige kunne finde ud af. Kan sagtens ændres.
    public void setupGame(String[] playerNames, Language language, UI ui){

        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
        board = new Board(language); //er der nogen grund til at kalde med language
                                     //eller kan det lige så godt tilgås gennem ui?
        diceCup = new DiceCup(2);
        this.ui = ui;
        runGame();
    }

    private void runGame() {
        //logik
        runTurn(player);
    }

    private void runTurn(Player player) {
        Turn turn = new Turn(player, this);
    }

    public DiceCup getDiceCup() {
        return diceCup;
    }

    public UI getUI() {
        return ui;
    }
}
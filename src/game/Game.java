package game;

import UI.UI;

public class Game {

    private Player[] players;
    private Board board;
    private DiceCup diceCup;
    private UI ui;

    public Game(UI ui) {
        this.ui = ui;
    }

    /**
     * Sets up the and ultimately runs the game. Called via main menu (UI).
     */
    public void setupGame(String[] playerNames){

        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
        board = new Board(ui.getLanguage());

        runGame(this);
    }

    /**
     * Keeps running turns until a winner is found.
     */
    private void runGame(Game game) {
        boolean winnerFound = false;
        int currentPlayerArrayIndexNo = 0; //Players[0] always goes first.
        do {
            runTurn(players[currentPlayerArrayIndexNo], this);

            if (players[currentPlayerArrayIndexNo].getBankroll().getBalance() >= 3000) { //TODO hvad hedder metoden?
                winnerFound = true; //TODO hvad skal der ellers stå her?
            } else {
                switch (currentPlayerArrayIndexNo) { //er der en mere elegant måde at gøre dette på?
                    case 0:
                        currentPlayerArrayIndexNo = 1;
                        break;
                    case 1:
                        currentPlayerArrayIndexNo = 0;
                        break;
                }
            }

        } while (!winnerFound);
    }

    private void runTurn(Player player, Game game) {
        new Turn(player, game); //TODO er det her nok?
    }

    public DiceCup getDiceCup() {
        return diceCup;
    }

    public UI getUI() {
        return ui;
    }
}
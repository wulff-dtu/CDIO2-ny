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
    public void setupGame(){

        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        players = {player1, player2}; //TODO sæt array op med player1 og 2

        board = new Board(ui.getLanguage());

        runGame(this);
    }

    /**
     * Keeps running turns until a winner is found.
     */
    private void runGame(Game game) {
        boolean winnerFound = false;
        int currentPlayerArrayIndex = 0; //Players[0] always goes first.
        do {
            runTurn(players[currentPlayerArrayIndex], this);

            if (players[currentPlayerArrayIndex].getBankroll.getBalance >= 3000) { //TODO hvad hedder metoden?
                winnerFound = true; //TODO hvad skal der ellers stå her?
            } else {
                switch (currentPlayerArrayIndex) { //er der en mere elegant måde at gøre dette på?
                    case 0:
                        currentPlayerArrayIndex = 1;
                        break;
                    case 1:
                        currentPlayerArrayIndex = 0;
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
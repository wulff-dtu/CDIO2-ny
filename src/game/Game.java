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
        players = new Player[2];
        players[0] = player1;
        players[1] = player2;

        board = new Board(ui.getLanguage());
        diceCup = new DiceCup(2);

        runGame(this);
    }

    /**
     * Keeps running turns until a winner is found.
     */
    private void runGame(Game game) {
        boolean winnerFound = false;
        int currentPlayerArrayIndex = 0; //players[0] always goes first.
        do {
            runTurn(players[currentPlayerArrayIndex], this);

            if (players[currentPlayerArrayIndex].getBankroll().getBalance() >= 3000) {
                winnerFound = true;
                game.endGame();
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
        new Turn(player, game);
    }

    public void endGame() {
        System.out.println(ui.getLanguage().getMessage("end_game_message")); //TODO burde nok rykkes til ui
        System.out.println();
    }

    public DiceCup getDiceCup() {
        return diceCup;
    }

    public UI getUI() {
        return ui;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }
}
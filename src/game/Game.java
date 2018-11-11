package game;

public class Game {

    private Player[] players;
    private Board board;
    private DiceCup diceCup;
    private boolean winnerFound;

    public Game(String[] playerNames) {
        addPlayers(playerNames);
        shufflePlayerIndex(players.length); //"players.length" is an arbitrary number of times. Could be many more.
        board = new Board();
        diceCup = new DiceCup();
        diceCup.addDie(6);
        diceCup.addDie(6);
        winnerFound = false;
        startGame();
    }

    private void addPlayers(String[] playerNames) {
        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
    }

    public void startGame() {
        int currentPlayerIndex = 0;
        Player currentPlayer = players[currentPlayerIndex];
        do {
            new Turn(currentPlayer);
            currentPlayerIndex++;
            if (currentPlayerIndex == players.length - 1) currentPlayerIndex = 0;
        } while (!winnerFound);
    }

    private void shufflePlayerIndex(int times) {
        for (int i = 0; i < times; i++) {
            int randomPlayerIndex1 = (int) (Math.random() * players.length);
            int randomPlayerIndex2 = (int) (Math.random() * players.length);
            Player randomPlayer1 = players[randomPlayerIndex1];
            Player randomPlayer2 = players[randomPlayerIndex2];
            players[randomPlayerIndex2] = randomPlayer1;
            players[randomPlayerIndex1] = randomPlayer2;
        }
    }

    public DiceCup getDiceCup() {
        return diceCup;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }
}
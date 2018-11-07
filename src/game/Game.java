package game;

public class Game {

    private Player[] players;
    private Board board;
    private DiceCup diceCup;
    private Language language;

    // TODO finish constructor
    public Game(String[] playerNames, Language language){

        players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }

        board = new Board(language);
        diceCup = new DiceCup(2);
        this.language = language;


    }


    /**
     * Method that starts the game and is called by Main
     */
    public void run() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
    }

    public DiceCup getDiceCup() {
        return diceCup;
    }

}
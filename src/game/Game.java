package game;

import java.awt.datatransfer.Clipboard;

public class Game {

    private Player[] players;
    private Board board;
    private DiceCup diceCup;

    // TODO make constructor
    public Game(){
    }


    /**
     * Method that starts the game and is called by Main
     */
    public void run() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
    }
}
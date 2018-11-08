package UI;

import game.Game;
import game.Player;

import java.util.Scanner;

public class UI {

    private Language language;
    private Game game;

    public UI(){
        language = new Language("ENGLISH"); //English is the default language.
        game = new Game(this);
    }

    /**
     * Displays the main menu and performs relevant actions based on user input.
     */
    public void mainMenu() {
        MainMenu menu = new MainMenu();
        menu.displayMenu(this);

        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        switch (input) {
            case 1:     //user chooses to play a game
                this.game.setupGame();
                break;
            case 2:     //user chooses to read rules
                System.out.println(language.getMessage("SOMETHING")); //TODO
                mainMenu();
                break;
            case 3:     //user chooses to change the language
                System.out.println(language.getMessage("SOMETHING")); //TODO
                String newLanguage = scanner.next();
                language.setCurrentLanguage(newLanguage);
                mainMenu();
                break;
            case 4:     //user closes program
                scanner.close();
                System.exit(0);
            default:    //input not recognized
                System.out.println(language.getMessage("SOMETHING"));
                mainMenu();
                break;
        }
    }

    public int turnMenu(Player player) {
        TurnMenu menu = new TurnMenu();
        menu.displayMenu(this);

        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        scanner.close();

        return input;
    }

    public Language getLanguage() {
        return language;
    }
}

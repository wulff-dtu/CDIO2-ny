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
                scanner.close();
                game.setupGame();
                break;
            case 2:     //user chooses to read rules
                scanner.close();
                System.out.println(language.getMessage("SOMETHING")); //TODO
                mainMenu();
                break;
            case 3:     //user chooses to change the language
                System.out.println(language.getMessage("SOMETHING")); //TODO
                String newLanguage = scanner.next();
                language.setCurrentLanguage(newLanguage);
                scanner.close();
                mainMenu();
                break;
            case 4:     //user closes program
                scanner.close();
                System.exit(0);
            default:
                System.out.println(language.getMessage("SOMETHING"));
                mainMenu();
                break;
        }
    }

    public int turnMenu(Player player) {
        return 0;
    }

    public void endGame() {
        System.out.println(language.getMessage("end_game_message")); //tilføj besked
    }

    public void setLanguage(String language) {
        language.setLanguage;
    }

    public Language getLanguage() {
        return language;
    }
}

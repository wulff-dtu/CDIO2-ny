package UI;

import game.Game;
import game.Player;

import java.util.Scanner;

public class UI {

    private Language language;
    private Game game;

    public UI(){
        language = new Language("english"); //English is the default language.
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
                showRules();
                mainMenu();
                break;
            case 3:     //user chooses to change the language
                languagePrompt();
                String newLanguage = scanner.next();
                language.setCurrentLanguage(newLanguage); //TODO virker ikke
                mainMenu();
                break;
            case 4:     //user closes program
                scanner.close();
                System.exit(0);
            default:    //input not recognized
                System.out.println(language.getMessage("input_error"));
                System.out.println();
                mainMenu();
                break;
        }
    }

    public int turnMenu(Player player) {
        TurnMenu menu = new TurnMenu();
        menu.displayMenu(this, player);

        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        return input;
    }

    public void showRules() {
        System.out.println();
        System.out.println(language.getMessage("rules1"));
        System.out.println(language.getMessage("rules2"));
        System.out.println(language.getMessage("rules3"));
        System.out.println(language.getMessage("rules4"));
        System.out.println();
    }

    public void languagePrompt() {
        System.out.println(language.getMessage("change_language"));
    }

    public void showScore(Game game) {
        for (int i=0; i < game.getPlayers().length; i++){
            System.out.println(game.getPlayers()[i].getName() + ": " + game.getPlayers()[i].getBankroll().getBalance());
        }

    }

    public Language getLanguage() {
        return language;
    }
}

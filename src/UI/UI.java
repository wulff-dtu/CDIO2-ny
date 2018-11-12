package UI;

import java.util.Scanner;

public class UI {

    private Language language;
    private Scanner scanner;

    public UI(){
        language = new Language("english");
        scanner = new Scanner(System.in);
    }

    public String promptMainMenu() {
        System.out.println(getString("main_menu_header"));
        System.out.println(getString("main_menu_option1"));
        System.out.println(getString("main_menu_option2"));
        System.out.println(getString("main_menu_option3"));
        System.out.println(getString("main_menu_option4"));

        String[] options = {"1", "2", "3", "4"};
        return inputAndValidate(options);
    }

    public String[] promptPlayerNames() {
        System.out.println(getString("main_start_howmanyplayers"));

        String[] options = {"2", "3", "4"};
        int numOfPlayers = Integer.parseInt(inputAndValidate(options));
        String[] playerNames = new String[numOfPlayers];

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.print(getString("main_start_writeplayername") + " " + (i + 1) + ": ");
            playerNames[i] = scanner.nextLine();
        }

        return playerNames;
    }

    private String inputAndValidate(String[] options) {

        String input = "0";
        Boolean isValid = false;

        while (!isValid) {
            input = scanner.nextLine();
            for (String option : options) {
                if (input.equals(option)) isValid = true;
            }
            if (!isValid) System.out.println(getString("invalid_input"));
        }

        return input;
    }

    public void changeLanguage() {
        System.out.println(getString("change_language_header"));
        System.out.println(getString("change_language_english"));
        System.out.println(getString("change_language_danish"));
        String[] options = {"1", "2"};
        switch(inputAndValidate(options)) {
            case "1" :
                this.language = new Language("english");
                break;
            case "2" :
                this.language = new Language("danish");
                break;
        }
    }

    public String turnMenu(String playerName) {
        System.out.println(playerName + getString("turn_menu_header"));
        System.out.println(getString("turn_menu_option1"));
        System.out.println(getString("turn_menu_option2"));
        System.out.println(getString("turn_menu_option3"));
        String[] options = {"1", "2", "3"};
        return inputAndValidate(options);
    }

    public void displayRules() {
        String rules = getString("rules");
        rules += "\n";
        rules = rules.replaceAll("(.{1,50})\\s+", "$1\n");
        System.out.println(rules);
    }

    private String getString(String stringID) {
        return (String)language.getMap().get(stringID);
    }

    public void turnMessage(String stringID) {
        System.out.println(getString(stringID));
    }

    public void displayScore(String[] playerNames, int[] playerScores) {
        for (int i = 0; i < playerNames.length; i++) {
            System.out.println(playerNames[i] + ": " + playerScores[i]);
        }
    }

    public void displayWinner(String playerName) {
        System.out.println(getString("end_game_congratulations") + " " + playerName + ", " + getString("end_game_youwon"));
    }
}

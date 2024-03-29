package UI;

import game.Player;

public class TurnMenu {

    public void displayMenu(UI ui, Player currentPlayer) {
        System.out.println();
        System.out.println(currentPlayer.getName()+ui.getLanguage().getMessage("turn_menu_header"));
        System.out.println(ui.getLanguage().getMessage("turn_menu_option1"));
        System.out.println(ui.getLanguage().getMessage("turn_menu_option2"));
        System.out.println(ui.getLanguage().getMessage("turn_menu_option3"));
        System.out.println();
    }
}

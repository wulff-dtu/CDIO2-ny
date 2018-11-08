package UI;

import game.Language;

public class MainMenu {

    public void displayMenu(UI ui) {
        System.out.println(ui.getLanguage().getMessage("main_menu_header"));
        System.out.println(ui.getLanguage().getMessage("main_menu_option1"));
        System.out.println(ui.getLanguage().getMessage("main_menu_option2"));
        System.out.println(ui.getLanguage().getMessage("main_menu_option3"));
        System.out.println(ui.getLanguage().getMessage("main_menu_option4"));
    }
}
package UI;

import game.Game;
import game.Player;

public class UI {

    private Language language;
    private Game game;

    public UI(){
        language = new Language("ENGLISH"); //English is the default language.
        game = new Game();
    }

    public int mainMenu() {
        return 0;
    }

    public int turnMenu(Player player) {
        return 0;
    }

    public void setLanguage(String language) {
        language.setLanguage;
    }
}

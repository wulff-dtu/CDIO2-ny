package game;

import UI.UI;

public class MainController {

    private Game game;
    private UI ui;

    public MainController() {
        ui = new UI();

    }

    private void mainMenu() {
        switch (ui.promptMainMenu()) {
            case "1" :
                break;
            case "2" :
                break;
            case "3" :
                break;
            case "4" :
                break;
            default:
                ui.displayText("invalid_input");
                mainMenu();
                break;
        }
    }

    public Game getGame() {
        return game;
    }

    public UI getUi() {
        return ui;
    }
}

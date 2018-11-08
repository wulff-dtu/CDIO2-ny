package game;

import UI.UI;

public class StartupController {

    UI ui;
    Game game;

    public StartupController() {
        ui = new UI();
        ui.displayMainMenu();
    }

}

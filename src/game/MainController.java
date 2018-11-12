package game;

import UI.UI;

public class MainController {

    private Game game;
    private UI ui;

    public MainController() {
        ui = new UI();
        mainMenu();
    }

    private void mainMenu() {
        switch (ui.promptMainMenu()) {
            case "1" :
                startGame();
                break;
            case "2" :
                ui.displayRules();
                break;
            case "3" :
                ui.changeLanguage();
                break;
            case "4" :
                System.exit(0);
                break;
        }
        mainMenu();
    }

    public void startGame() {
        game = new Game(ui.promptPlayerNames());
        do {
            turnMenu();
        } while (!game.isWinnerFound());
        String winner = game.getPlayers()[game.getPlayerTurnIndex()].getName();
        ui.displayWinner(winner);
    }

    public void turnMenu() {
        switch (ui.turnMenu(game.getPlayers()[game.getPlayerTurnIndex()].getName())) {
            case "1" :
                game.newTurn();
                ui.turnMessage(game.getTurn().getTile().getMessage());
                if (game.getTurn().tile.grantsExtraTurn()) {
                    if (game.getPlayerTurnIndex() != 0) {
                        game.setPlayerTurnIndex(game.getPlayerTurnIndex() - 1);
                    } else {
                        game.setPlayerTurnIndex(game.getPlayers().length - 1);
                    }

                }
                break;
            case "2" :
                String[] playerNames = new String[game.getPlayers().length];
                int[] playerScores = new int[game.getPlayers().length];
                for (int i = 0; i < game.getPlayers().length; i++) {
                    playerNames[i] = game.getPlayers()[i].getName();
                    playerScores[i] = game.getPlayers()[i].getBankroll().getBalance();
                }
                ui.displayScore(playerNames, playerScores);
                turnMenu();
                break;
            case "3" :
                mainMenu();
                break;
        }
    }
}

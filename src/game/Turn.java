package game;

public class Turn {

    public Turn(Player currentPlayer, Game currentGame) {
        Game game = currentGame;
        int diceValue;

        int input = game.getUI().turnMenu(currentPlayer);
        switch (input) {
            case 1:
                diceValue = game.getDiceCup().throwDice();
                break;
            case 2:
                game.getUI().closeGame();
                break;
            case 3:
                //se stilling
                break;
            default:
                break;
        }


    }

}

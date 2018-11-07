package game;

public class Turn {

    private int diceValue;
    private Game game;

    public Turn(Player currentPlayer, Game game) {
        this.game = game;

        int input = game.getUI().turnMenu(currentPlayer);
        switch (input) {
            case 1:
                diceValue = game.getDiceCup().throwDice();
                break;
            case 2:
                game.getUI().endGame();
                break;
            case 3:
                //se stilling
                break;
            default:
                break;
        }

        diceRollEffect(diceValue, game.);
    }

    private void diceRollEffect(int diceValue, Player player) {
        //TODO

    }

}

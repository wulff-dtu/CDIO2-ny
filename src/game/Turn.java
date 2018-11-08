package game;

public class Turn {

    private int diceValue;
    private Game game;

    public Turn(Player player, Game game) {
        this.game = game;

        int input = game.getUI().turnMenu(player);
        switch (input) {
            case 1:
                diceValue = game.getDiceCup().throwDice();
                break;
            case 2:
                game.endGame();
                break;
            case 3:
                //se stilling
                break;
            default:
                break;
        }

        diceRollEffect(diceValue, player);
    }

    private void diceRollEffect(int diceValue, Player player) {
        /**/


    }

}

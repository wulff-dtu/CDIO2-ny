package game;

public class Turn {

    public Turn(Player player) {

        int input = game.getUI().turnMenu(player); //show a turn menu and receive user input
        switch (input) {
            case 1:     //roll dice
                DiceCup diceCup = game.getDiceCup();
                diceCup.throwDice();
                int sum = diceCup.getSum();
                Tile tileDestination = game.getBoard().getTiles()[sum-2];   //The tile that the player will land on.
                player.getBankroll().adjustBalance(tileDestination.getEffectOnBalance());   //manges the effect of the tile on the player.
                game.getUI().displayMessage(tileDestination.getMessage());  //displays the tiles message.
                break;
            case 2:     //give up
                game.endGame(); //TODO virker ikke
                break;
            case 3:     //show score
                game.getPlayers(); //TODO færdiggør
                break;
            default:
                break;
        }
    }
}

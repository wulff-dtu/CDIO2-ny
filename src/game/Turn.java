package game;

public class Turn {

    private Game game;

    public Turn(Player player, Game game) {
        this.game = game;
        int diceValue;

        int input = this.game.getUI().turnMenu(player); //show a turn menu and receive user input
        switch (input) {
            case 1:     //roll dice
                diceValue = this.game.getDiceCup().throwDice();
                diceRollEffect(diceValue, player);
                break;
            case 2:     //give up
                this.game.endGame(); //TODO virker ikke
                break;
            case 3:     //show score
                this.game.getPlayers(); //TODO færdiggør
                break;
            default:
                break;
        }
    }

    private void diceRollEffect(int diceValue, Player player) { //TODO skal måske laves lidt om så den bruger board
        switch(diceValue){
            case 2:
                //Tower 		+250
                System.out.println(game.getBoard().getTiles()[2].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[2].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 3:
                //Crater 		-100
                System.out.println(game.getBoard().getTiles()[3].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[3].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 4:
                //Palace gates		+100
                System.out.println(game.getBoard().getTiles()[4].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[4].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 5:
                //Cold desert	 	-20
                System.out.println(game.getBoard().getTiles()[5].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[5].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 6:
                //Walled city 		+180
                System.out.println(game.getBoard().getTiles()[6].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[6].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 7:
                //Monastery 		0
                System.out.println(game.getBoard().getTiles()[7].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[7].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 8:
                //Black cave 		-70
                System.out.println(game.getBoard().getTiles()[7].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[8].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 9:
                //Huts in the mountain 		+60
                System.out.println(game.getBoard().getTiles()[9].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[9].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 10:
                //The Werewall (werewolf-wall)		-80,	men spilleren får en ekstra tur.
                System.out.println(game.getBoard().getTiles()[10].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[10].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 11:
                //The pit 		-50
                System.out.println(game.getBoard().getTiles()[11].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[11].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
            case 12:
            //Goldmine 		+650
                System.out.println(game.getBoard().getTiles()[12].getMessage());
                player.getBankroll().adjustBalance(game.getBoard().getTiles()[2].getEffectOnBalance());
                if (game.getBoard().getTiles()[12].isGrantsExtraTurn() == true) {
                    game.runTurn(player, game);
                }
                break;
        }
    }

}

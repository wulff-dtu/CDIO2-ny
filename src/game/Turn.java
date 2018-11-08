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
                game.getUI().endGame();
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
        /*ChangeBankRoll skal laves om*/
    switch(diceValue){
        case 1:
            System.out.println("error in diceRollEffect - you can not role a 1");
            break;
        case 2:
            //Tower 		+250
            player.getBankroll().setBalance(250);
            break;
        case 3:
            //Crater 		-100
            player.getBankroll().setBalance(-100);
            break;
        case 4:
            //Palace gates		+100
            player.getBankroll().setBalance(100);
            break;
        case 5:
            //Cold Desert	 	-20
            player.getBankroll().setBalance(-20);
            break;
        case 6:
            player.getBankroll().setBalance(180);
            //Walled city 		+180
            break;
        case 7:
            player.getBankroll().setBalance(0);
            //Monastery 		0
            break;
        case 8:
            player.getBankroll().setBalance(-70);
            //Black cave 		-70
            break;
        case 9:
            player.getBankroll().setBalance(60);
            //Huts in the mountain 		+60
            break;
        case 10:
            player.getBankroll().setBalance(-80);
            /* den neden under skal nok erstattes med en diceroll function*/
            int r = (int) (Math.random() * (12 - 2)) + 2;
            diceRollEffect(r, player);
            //The Werewall (werewolf-wall)		-80,	men spilleren får en ekstra tur.
            break;
        case 11:
                //The pit 		-50
            player.getBankroll().setBalance(-50);
            break;
        case 12:
        //Goldmine 		+650
            player.getBankroll().setBalance(650);
            break;}
    }

}

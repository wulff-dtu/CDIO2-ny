package game;

public class Bankroll {

    private int balance;

    //The game starts with each player having 1000 and the bankroll can't be negative

    public void changeBalance(){

        balance = 1000;
        if(balance < 0 ){

            balance = 0;
        }

    }

    //Get balance

    public Bankroll(){}

    public int getBalance() {

            return balance;
    }    


}

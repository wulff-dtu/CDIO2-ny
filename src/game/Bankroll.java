package game;

public class Bankroll {

    private int balance;

    //The game starts with each player having 1000 

    public Bankroll() {
        balance = 1000;
    }
    
    //The bankroll can't be negative
    
    
    public void changeBalance(){


        if(balance < 0 ){

            balance = 0;
        }

    }

    //Get balance
    
    
    public int getBalance() {

            return balance;
    }

}

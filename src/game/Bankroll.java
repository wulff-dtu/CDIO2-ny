package game;

public class Bankroll {

    private int balance;

    //The game starts with each player having 1000
    public Bankroll() {
        this.balance = 1000;
    }


    //The bankroll can't be negative
    private void adjustIfBalanceBelowZero(){
        if(this.balance < 0 ){
            this.balance = 0;
        }
    }

    public void adjustBalance(int change){
        this.balance += change;
        adjustIfBalanceBelowZero();
    }

    //Get balance
    public int getBalance() {
            return this.balance;
    }

}

package it.unibo.pps.e1;

public class NoOverdraftWithdrawPolicy implements WithdrawalPolicy{

    @Override
    public boolean canWithdraw(int balance, int amount) {
        return balance - amount >= 0;
    }
}

package it.unibo.pps.e1;

public class MaxNegativeBalanceWithdrawPolicy implements WithdrawalPolicy {
    private final int maxNegativeBalance;
    public MaxNegativeBalanceWithdrawPolicy(int maxNegativeBalance){
        this.maxNegativeBalance = maxNegativeBalance;
    }
    @Override
    public boolean canWithdraw(int balance, int amount) {
        return balance-amount >= maxNegativeBalance;
    }
}

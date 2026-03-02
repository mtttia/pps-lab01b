package it.unibo.pps.e1;

public interface WithdrawalPolicy {
    boolean canWithdraw(int balance, int amount);
}

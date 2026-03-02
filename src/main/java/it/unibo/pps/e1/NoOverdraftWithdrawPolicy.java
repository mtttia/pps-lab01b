package it.unibo.pps.e1;

public class NoOverdraftWithdrawPolicy extends MaxNegativeBalanceWithdrawPolicy{
    public static final int MAX_NEGATIVE_BALANCE = 0;

    public NoOverdraftWithdrawPolicy() {
        super(MAX_NEGATIVE_BALANCE);
    }
}

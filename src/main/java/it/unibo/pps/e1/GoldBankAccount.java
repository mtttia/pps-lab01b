package it.unibo.pps.e1;

public class GoldBankAccount extends FlexibleBankAccount {
    public static final int FEE_AMOUNT = 0;
    public static final int MAX_NEGATIVE_BALANCE = 500;

    public GoldBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    protected WithdrawalPolicy getWithdrawPolicy() {
        return new MaxNegativeBalanceWithdrawPolicy(MAX_NEGATIVE_BALANCE);
    }

    @Override
    protected FeeCalculationLogic getFeeCalculationLogic() {
        return new FixedFeeCalculationLogic(FEE_AMOUNT);
    }
}

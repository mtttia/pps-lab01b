package it.unibo.pps.e1;

public class BronzeBankAccount extends FlexibleBankAccount {
    public static final int FREE_FEE_LIMIT = 100;
    public static final int FEE_AMOUNT = 1;


    public BronzeBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    protected WithdrawalPolicy getWithdrawPolicy() {
        return (_, _) -> true;
    }

    @Override
    protected FeeCalculationLogic getFeeCalculationLogic() {
        return new WithFreeLimitFeeCalculationLogic(FREE_FEE_LIMIT, FEE_AMOUNT);
    }
}

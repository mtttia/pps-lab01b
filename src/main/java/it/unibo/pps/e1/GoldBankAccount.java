package it.unibo.pps.e1;

public class GoldBankAccount extends FlexibleBankAccount {
    public static final int FEE_AMOUNT = 0;

    public GoldBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    protected WithdrawalPolicy getWithdrawPolicy() {
        return (_, _) -> true;
    }

    @Override
    protected FeeCalculationLogic getFeeCalculationLogic() {
        return new FixedFeeCalculationLogic(FEE_AMOUNT);
    }
}

package it.unibo.pps.e1;

public class SilverBankAccount extends FlexibleBankAccount {
    public final int FEE_AMOUNT = 1;

    public SilverBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    protected WithdrawalPolicy getWithdrawPolicy() {
        return new NoOverdraftWithdrawPolicy();
    }

    @Override
    protected FeeCalculationLogic getFeeCalculationLogic() {
        return new FixedFeeCalculationLogic(FEE_AMOUNT);
    }
}

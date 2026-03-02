package it.unibo.pps.e1;

public abstract class FlexibleBankAccount implements BankAccount{
    private final BankAccount base;

    public FlexibleBankAccount(BankAccount bankAccount){
        this.base = bankAccount;
    }

    protected abstract WithdrawalPolicy getWithdrawPolicy();
    protected abstract FeeCalculationLogic getFeeCalculationLogic();

    @Override
    public int getBalance() {
        return base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        base.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        if (!getWithdrawPolicy().canWithdraw(getBalance(), amount)){
            throw new IllegalStateException();
        }
        base.withdraw(getFeeCalculationLogic().applyFee(amount));
    }
}

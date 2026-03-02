package it.unibo.pps.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class BaseBankAccountTest {

    protected abstract BankAccount getBankAccount();
    protected static final int INITIAL_BALANCE = 1000;
    protected static final int VALID_WITHDRAW = 200;
    protected static final int TOO_LARGE_WITHDRAW = 1200;

    protected void initializeBankAccountBalance(){
        this.getBankAccount().deposit(INITIAL_BALANCE);
    }

    @Test
    public void testInitiallyEmpty() {
        int emptyBalanceAmount = 0;
        assertEquals(emptyBalanceAmount, this.getBankAccount().getBalance());
    }

    @Test
    public void testCanDeposit() {
        initializeBankAccountBalance();
        assertEquals(INITIAL_BALANCE, this.getBankAccount().getBalance());
    }
}

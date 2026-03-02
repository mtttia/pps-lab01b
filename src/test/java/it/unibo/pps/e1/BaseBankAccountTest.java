package it.unibo.pps.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class BaseBankAccountTest {

    protected abstract BankAccount getBankAccount();
    protected static final int INITIAL_BALANCE = 1000;

    protected void initializeBankAccountBalance(){
        this.getBankAccount().deposit(INITIAL_BALANCE);
    }

    @Test
    public void testInitiallyEmpty() {
        assertEquals(0, this.getBankAccount().getBalance());
    }

    @Test
    public void testCanDeposit() {
        initializeBankAccountBalance();
        assertEquals(1000, this.getBankAccount().getBalance());
    }
}

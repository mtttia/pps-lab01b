package it.unibo.pps.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class BaseBankAccountTest {

    protected abstract BankAccount getBankAccount();

    protected void initializeBankAccountBalance(){
        int initialAmount = 1000;
        this.getBankAccount().deposit(initialAmount);
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

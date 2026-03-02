package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BronzeBankAccountTest extends BaseBankAccountTest{
    private BronzeBankAccount account;

    @BeforeEach
    void init(){
        this.account = new BronzeBankAccount(new CoreBankAccount());
    }

    @Override
    protected BankAccount getBankAccount() {
        return account;
    }

    @Test
    public void testCanWithdraw() {
        initializeBankAccountBalance();
        this.account.withdraw(200);
        assertEquals(799, this.account.getBalance());
    }

    @Test
    public void testCanWithdrawWithinFreeLimit() {
        initializeBankAccountBalance();
        this.account.withdraw(99);
        assertEquals(901, this.account.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        initializeBankAccountBalance();
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1200));
    }
}

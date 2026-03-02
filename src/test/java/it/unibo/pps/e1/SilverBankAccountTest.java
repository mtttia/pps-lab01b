package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SilverBankAccountTest extends BaseBankAccountTest{

    private SilverBankAccount account;

    @BeforeEach
    void init(){
        this.account = new SilverBankAccount(new CoreBankAccount());
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
    public void testCannotWithdrawMoreThanAvailable(){
        initializeBankAccountBalance();
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1200));
    }
}

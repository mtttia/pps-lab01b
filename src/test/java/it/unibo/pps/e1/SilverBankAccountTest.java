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
        int expectedBalance = 799;

        initializeBankAccountBalance();
        this.account.withdraw(VALID_WITHDRAW);
        assertEquals(expectedBalance, this.account.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        initializeBankAccountBalance();
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(TOO_LARGE_WITHDRAW));
    }
}

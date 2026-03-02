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
        int expectedBalance = 799;

        initializeBankAccountBalance();
        this.account.withdraw(VALID_WITHDRAW);
        assertEquals(expectedBalance, this.account.getBalance());
    }

    @Test
    public void testCanWithdrawWithinFreeLimit() {
        int validWithdrawWithoutFeeAmount = 99;
        int expectedBalance = 901;

        initializeBankAccountBalance();
        this.account.withdraw(validWithdrawWithoutFeeAmount);
        assertEquals(expectedBalance, this.account.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        initializeBankAccountBalance();
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(TOO_LARGE_WITHDRAW));
    }
}

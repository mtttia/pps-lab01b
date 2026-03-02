package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoldBankAccountTest extends BaseBankAccountTest{
    private GoldBankAccount account;

    @BeforeEach
    void init(){
        this.account = new GoldBankAccount(new CoreBankAccount());
    }

    @Override
    protected BankAccount getBankAccount() {
        return account;
    }

    @Test
    public void testCanWithdraw() {
        int expectedBalance = 800;

        initializeBankAccountBalance();
        this.account.withdraw(VALID_WITHDRAW);
        assertEquals(expectedBalance, this.account.getBalance());
    }

    @Test
    public void testCanWithdrawMoreThanAvailable(){
        initializeBankAccountBalance();
        int maxWithdrawAvailable = BaseBankAccountTest.INITIAL_BALANCE + GoldBankAccount.MAX_NEGATIVE_BALANCE;
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(maxWithdrawAvailable));
    }

    @Test
    public void testCannotHaveTooMuchNegativeBalance(){
        initializeBankAccountBalance();
        int maxWithdrawAvailable = BaseBankAccountTest.INITIAL_BALANCE + GoldBankAccount.MAX_NEGATIVE_BALANCE + 1;
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(maxWithdrawAvailable));
    }
}

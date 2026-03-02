package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        initializeBankAccountBalance();
        this.account.withdraw(200);
        assertEquals(800, this.account.getBalance());
    }
}

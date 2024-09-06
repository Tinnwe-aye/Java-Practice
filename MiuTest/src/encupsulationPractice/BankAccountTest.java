package encupsulationPractice;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(100);
    }

    @Test
    public void testDeposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(30);
        assertEquals(70, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        account.withdraw(150);
        assertEquals(100, account.getBalance(), 0.01);
    }
}

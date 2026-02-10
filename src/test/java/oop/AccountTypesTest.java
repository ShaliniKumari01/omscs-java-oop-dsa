package oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTypesTest {

    @Test
    void savingsAccountAppliesMonthlyInterest() {
        SavingsAccount sa = new SavingsAccount("S1", 1000.0, 0.12); // 12% annual
        sa.monthlyUpdate(); // apply 1% monthly
        assertEquals(1010.0, sa.getBalance(), 0.01);
    }

    @Test
    void checkingAccountAppliesMonthlyFee() {
        CheckingAccount ca = new CheckingAccount("C1", 500.0, 10.0);
        ca.monthlyUpdate();
        assertEquals(490.0, ca.getBalance(), 0.01);
    }

    @Test
    void polymorphismWorksWithAccountReference() {
        Account acc = new SavingsAccount("S2", 1000.0, 0.12);
        acc.monthlyUpdate(); // calls SavingsAccount.monthlyUpdate()
        assertTrue(acc.getBalance() > 1000.0);
    }
}

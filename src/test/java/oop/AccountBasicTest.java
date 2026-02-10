package oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountBasicTest {

    static class DummyAccount extends Account {
        public DummyAccount(String num, double bal) { super(num, bal); }
        @Override public void monthlyUpdate() { /* no-op */ }
    }

    @Test
    void depositIncreasesBalance() {
        Account acc = new DummyAccount("A1", 100);
        acc.deposit(50);
        assertEquals(150, acc.getBalance(), 0.0001);
    }

    @Test
    void withdrawDecreasesBalance() {
        Account acc = new DummyAccount("A2", 100);
        acc.withdraw(40);
        assertEquals(60, acc.getBalance(), 0.0001);
    }

    @Test
    void withdrawMoreThanBalanceThrows() {
        Account acc = new DummyAccount("A3", 100);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(200));
    }
}

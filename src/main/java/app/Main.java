package app;

import oop.Account;
import oop.SavingsAccount;
import oop.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("S-100", 1000.0, 0.12); // 12% annual
        Account checking = new CheckingAccount("C-200", 500.0, 10.0); // $10 monthly fee

        System.out.println("=== Before monthlyUpdate ===");
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Checking balance: " + checking.getBalance());

        savings.monthlyUpdate();
        checking.monthlyUpdate();

        System.out.println("\n=== After monthlyUpdate ===");
        System.out.println("Savings balance: " + savings.getBalance());
        System.out.println("Checking balance: " + checking.getBalance());
    }
}

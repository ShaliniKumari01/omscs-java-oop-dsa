package oop;

public class SavingsAccount extends Account implements InterestBearing {

    private final double annualInterestRate; // example: 0.04 for 4%

    public SavingsAccount(String accountNumber, double openingBalance, double annualInterestRate) {
        super(accountNumber, openingBalance);
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    @Override
    public void applyMonthlyInterest() {
        double monthlyRate = annualInterestRate / 12.0;
        double interest = getBalance() * monthlyRate;
        setBalance(getBalance() + interest);
    }

    @Override
    public void monthlyUpdate() {
        applyMonthlyInterest();
    }
}

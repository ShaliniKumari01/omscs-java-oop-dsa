package oop;

public class CheckingAccount extends Account {

    private final double monthlyFee;

    public CheckingAccount(String accountNumber, double openingBalance, double monthlyFee) {
        super(accountNumber, openingBalance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void monthlyUpdate() {
        // Apply monthly fee if possible
        if (getBalance() >= monthlyFee) {
            setBalance(getBalance() - monthlyFee);
        }
    }
}

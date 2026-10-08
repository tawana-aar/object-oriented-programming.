public class CurrentAccount extends Account {

    private final double overdraftLimit;
    private static final double MONTHLY_FEE = 10.00;

    public CurrentAccount(String accountNumber, double balance,
                          double overdraftLimit) {

        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
        } 
        else if (balance - amount < -overdraftLimit) {
            System.out.println(
                "Withdrawal rejected: overdraft limit of $"
                + overdraftLimit + " exceeded."
            );
        } 
        else {
            balance -= amount;
            System.out.println("Current withdrawal: $" + amount);
        }
    }

    @Override
    public void endOfMonth() {

        balance -= MONTHLY_FEE;

        System.out.println(
            "Monthly maintenance fee deducted: $" + MONTHLY_FEE
        );
    }
}
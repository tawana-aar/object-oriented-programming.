public class SavingsAccount extends Account {

    private final double minimumBalance;
    private static final double INTEREST_RATE = 0.02;

    public SavingsAccount(String accountNumber, double balance,
                          double minimumBalance) {

        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
        } 
        else if (balance - amount < minimumBalance) {
            System.out.println(
                "Withdrawal rejected: balance cannot go below minimum balance of $"
                + minimumBalance
            );
        } 
        else {
            balance -= amount;
            System.out.println("Savings withdrawal: $" + amount);
        }
    }

    @Override
    public void endOfMonth() {

        double interest = balance * INTEREST_RATE;
        balance += interest;

        System.out.println(
            "Savings interest added: $" + interest
        );
    }
}
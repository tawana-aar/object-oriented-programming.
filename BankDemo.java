import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(
            new SavingsAccount("S001", 1000.00, 200.00)
        );

        accounts.add(
            new CurrentAccount("C001", 500.00, 300.00)
        );

        accounts.add(
            new SavingsAccount("S002", 1500.00, 300.00)
        );

        accounts.add(
            new CurrentAccount("C002", 200.00, 500.00)
        );

        System.out.println("=== BANK ACCOUNT DEMO ===");

        for (Account account : accounts) {

            System.out.println("\nProcessing account...");

            account.withdraw(700);

            System.out.println(
                "Balance before month-end: $"
                + account.getBalance()
            );

            account.endOfMonth();

            System.out.println(
                "Balance after month-end: $"
                + account.getBalance()
            );
        }
    }
}
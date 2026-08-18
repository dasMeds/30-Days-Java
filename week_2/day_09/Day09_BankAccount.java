package week_2.day_09;

public class Day09_BankAccount {
        // encapsulated private fields
    private String accountName;
    private String accountNumber;
    private double accountBalance;

    public Day09_BankAccount(String accountName, String accountNumber, double initialBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;

        if(initialBalance >= 0){
            this.accountBalance = initialBalance;
        } else {
            this.accountBalance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    } 

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit rejected. Amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected. Amount must be greater than 0.");

        } else if (amount > accountBalance) {
            System.out.println("Withdrawal rejected. Insufficient funds.");
        } else {
            accountBalance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        }
    }
}


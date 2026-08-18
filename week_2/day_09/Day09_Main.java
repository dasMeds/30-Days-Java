package week_2.day_09;

public class Day09_Main {
    public static void main(String[] args) {

        Day09_BankAccount myAccount = new Day09_BankAccount("James Houston", "AAA-1826", 500.00);
    
    System.out.println("--- Initial State ---");
        System.out.println("Account Holder: " + myAccount.getAccountName());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Starting Balance: $" + myAccount.getAccountBalance());

        System.out.println("\n--- Testing Transactions ---");
        // Valid deposit
        myAccount.deposit(150.50);

        // Invalid deposit (rejected)
        myAccount.deposit(-50.00);

        // Valid withdrawal
        myAccount.withdraw(200.00);

        // Invalid withdrawal (overdraft attempt, rejected)
        myAccount.withdraw(1000.00);

        System.out.println("\n--- Final State ---");
        System.out.println("Ending Balance: $" + myAccount.getAccountBalance());
    }
}

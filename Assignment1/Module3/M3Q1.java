// Module 3 - Q1
// Class BankAccount with attributes accountNumber and balance,
// and methods deposit and withdraw using encapsulation.

public class Module3_Q1 {

    static class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000.0);
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500.0);
        acc.withdraw(300.0);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}


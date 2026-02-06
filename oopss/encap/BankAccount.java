// Create a class BankAccount with:
// private accountNumber
// private balance
// Methods:
// setAccountNumber()
// deposit(amount)
// withdraw(amount) (withdraw only if balance is sufficient)
// getBalance()
// Task:
// Create object in main
// Deposit and withdraw money
// Print final balance

class BankAccount {

    private long accountNumber;
    private int balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
// here is the comment 
    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {

            System.out.println("the amount should be positive");
        }
    }

    public void withdrawl(int amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("the amount is wrong or insuffecient balance");
        }
    }

    public int getBalance() {
        return balance;

    }

}

package Day4;

public class BankAccount {
    private String accountHolder;
    private double balance;

    private void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Negative Balance Not Allowed");
        }
    }

    public  BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            amount = this.balance + amount;
            setBalance(amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void displayAccount() {
        System.out.println("HolderName Is: " + this.accountHolder);
        System.out.printf("Balance is: Rs.%.2f%n", this.balance);

    }
}

package exceptionhandling;



public class AtmAccount   {
    private String accountHolder;
    private double balance;


    private void setBalance(double balance) {
        if (balance < 0) {
            this.balance=0;
            System.out.println("Balance Set as Zero.");
        } else {
            
            this.balance = balance;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {

        return balance;
    }

    public AtmAccount(String accountHolder, double balance) {
        this.accountHolder=accountHolder;
        setBalance(balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than Zero.");

        } else {
            setBalance(amount + balance);
            System.out.printf("Current Balance Is: Rs.%.2f%n", getBalance());
        }

    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal Amount Must Be Greater Than Zero.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal Amount Is greater Than Available Balance");
        } else {
            balance -= amount;
            System.out.printf("Current Balance Is: Rs.%.2f%n", balance);
        }
    }

}

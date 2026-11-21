package Day4;

public class SavingsAccount extends BankAccount {
    private double interestRate = 5.0;
    public  SavingsAccount(String accountHolder, double balance,double interestRate){
        super(accountHolder,balance);
        this.interestRate=interestRate;
    }

    public void addInterest(){
         super.deposit(super.getBalance()*(interestRate/100));

    }

}

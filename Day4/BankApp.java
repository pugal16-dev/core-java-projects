package Day4;

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount("Pugal", 10000, 5.0);
        obj1.displayAccount();
        obj1.deposit(2000);
        obj1.addInterest();
        obj1.displayAccount();

    }

}

package polymorphism;

public class Payment {
    private String payerName;
    private double amount;

    public Payment(String payerName, double amount) {
        this.payerName = payerName;
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("invalid amount");
        }
    }

    public String getPayerName() {
        return payerName;
    }

    public double getAmount() {

        return amount;

    }

    public void processPayment() {
        System.out.println("PayerName: " + payerName);
        System.out.printf("Amount: Rs.%.2f%n", amount);

    }

    public void processPayment(String note) {
        this.processPayment();
        System.out.println(note);

    }

}

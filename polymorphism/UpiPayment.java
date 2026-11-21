package polymorphism;

public class UpiPayment extends Payment {

    private String upiId;

    public UpiPayment(String payerName, double amount, String upiId) {

        super(payerName, amount);

        this.upiId = upiId;

    }


    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("upiId: " + upiId);
        
        System.out.println("Convenience Fee: Rs.0.00 (Zero Fee UPI)");

    }
   

}

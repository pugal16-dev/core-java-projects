package polymorphism;

public class CreditCardPayment extends Payment {
    private String cardLastFour;

    public CreditCardPayment(String payerName, double amount, String cardLastFour) {

        super(payerName, amount);
        this.cardLastFour = cardLastFour;
    }

    @Override
    public void processPayment( ) {

        
        System.out.println("PayerName Is: "+super.getPayerName());

        System.out.println("Credit Card No:****-"+cardLastFour);

        double convenienceFee = ((2.00/100)*super.getAmount());
        System.out.printf("Base Amount Is: Rs.%.2f%nConvenience Fee Is: Rs.%.2f%nTotal Amount Is: Rs.%.2f%n",
                super.getAmount(), convenienceFee, (super.getAmount() + convenienceFee));


    }
}

package polymorphism;

public class PaymentApp {

    public static void main(String[] args) {
        Payment obj1 = new Payment("Kavi", 1000);
        obj1.processPayment();
        obj1.processPayment("Home Rent");

        Payment[] transactions = { new Payment("YTT", 2500), new UpiPayment("raj", 1000, "raj@oksbi"),
                new CreditCardPayment("Bullet", 3000, "4563"), new UpiPayment("kilaa", 2500, "killa@upi"),
                new UpiPayment("Rithul", 100, "rithul@upi") };

        String[] notes = { "Mobile Recharge", null, "Home rent", "", "UPI Water bill" };

        for (int i = 0; i < transactions.length; i++) {
            if (notes[i] != null && !notes[i].isEmpty()) {
                transactions[i].processPayment(notes[i]);

                System.out.println("---------   ----------");
            } else {
                transactions[i].processPayment();

                System.out.println("---------   ----------");

            }
        }
        transactions[2].processPayment();

    }

}

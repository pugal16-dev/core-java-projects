public class LoanSimulator {
    public static void main(String[] args) {
        double carLoan = 12000;
        double emiPayment = 2000;
        for (int i = 1; carLoan > 0; i++) {
            System.err.println("Month" + i + "Payment Successfull, Remaining Amount to be paied: Rs."
                    + (carLoan = carLoan - emiPayment));

        }

        double creditCardDebt=5000;
        double monthlyPayment=800;
        int monthTaken=0;
        while(creditCardDebt>0){
            monthTaken++;
            creditCardDebt=creditCardDebt-monthlyPayment;
        }
        System.out.println(monthTaken+" Months Taken to pay off the credit card debt");
    }

}

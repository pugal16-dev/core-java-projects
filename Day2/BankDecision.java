public class BankDecision {

    public static void main(String[] args) {
        int creditScore = 650;
         int menuOption = 3;

        if (creditScore >= 750) {
            System.out.println("Loan Approve: Excellent Credit");
        } else if (creditScore >= 650 && creditScore < 750) {
            System.out.println("Loan Approved: Good Credit");
        } else if (creditScore >= 550 && creditScore < 650) {
            System.out.println("Review Required: Fair Credit");
        } else {
            System.out.println("Loan Denied: Poor Credit");
        }
    

   

    switch(menuOption)
    {

        case 1 : {
            System.out.println("Checking Account Balance");
            break;}
        
        case 2: {
            System.out.println("Processing Deposit");
            break;
        }
        case 3: {
            System.out.println("Processing withdrawl");
            break;
        }
        case 4: {
            System.out.println("Exiting System, Good bye");
            break;
        }
        default: {
            System.out.println("Error, Invalid Menu");
        }
    }

}}

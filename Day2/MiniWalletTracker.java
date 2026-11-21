
public class MiniWalletTracker {
    public static void main(String[] args) {

        String userName = "Pugal 827";
        double startingBalance = 1000.00;
        double costOfBreakFast = 85.00;
        double costOfLunch = 50;
        int noOfCoffee = 3;
        double costOfCoffee = 25.00;
        double salaryAmount = 30000.00;
        double investemnetPercentage = 0.20;

        double totalCoffeeCost = noOfCoffee * costOfCoffee;
        double totalDailyExpenses = costOfBreakFast + costOfLunch + totalCoffeeCost;
        double remainingBalance = startingBalance - totalDailyExpenses;
        double monthlyInvestmentAmount = salaryAmount * investemnetPercentage;
        boolean budgetCheck = totalDailyExpenses < 500;

        System.out.println("---DAILY EXPENSE & INVESTMENT REPORT---");
        System.out.println("User: " + userName);
        System.out.println("Total Spent Today: Rs." + totalDailyExpenses);
        System.out.println("REmaining Wallet Balance: Rs." + remainingBalance);
        System.out.println("Stayed Under 500 Rs budget?" + budgetCheck);
        System.out.println("Target Monthly Invetsment:Rs." + monthlyInvestmentAmount);

    }

}

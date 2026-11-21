public class ExpenseAnalyzer {
    public static void main(String[] args) {
        
        double[] weeklyExpenses={22.3,76.4,99,100,85.29};
        double totalExpenseWeek=0;
        double highestExpense=weeklyExpenses[0];

        for(int i=0;i<weeklyExpenses.length;i++){
            totalExpenseWeek=totalExpenseWeek+weeklyExpenses[i];
            if(highestExpense<weeklyExpenses[i]){
                highestExpense=weeklyExpenses[i];


            }
        }
        System.err.println("Total Expense Of The Week is: Rs."+totalExpenseWeek+"\nThe Single Highest Expense Amount Of The Week Is: Rs."+highestExpense);
    }
    
}

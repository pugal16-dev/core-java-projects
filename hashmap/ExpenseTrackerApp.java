package hashmap;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {

        HashMap<String, Double> categoryExpenses = new HashMap<>();
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            try {
                System.out.println(
                        "Select the option based on the menu:\n1.Log Expense To Category\n2.View All Categories & Grand total\n3.Search Category Spend\n4.Delete Category\n5.Highest Spending Category\n6.Exit\n");
                int inputOption = input.nextInt();
                input.nextLine();
                switch (inputOption) {
                    case 1: {
                        System.out.println("Enter the category: ");

                        String category = input.nextLine().trim().toLowerCase();

                        if (category.isEmpty()) {
                            System.out.println("Enter a valid category.");
                        } else {
                            System.out.println("Enter the expense amount: ");
                            double expenseAmount = input.nextDouble();
                            if (expenseAmount <= 0) {
                                System.out.println("Enter a valid expense amount.");
                            } else {
                                categoryExpenses.put(category,
                                        categoryExpenses.getOrDefault(category, 0.0) + expenseAmount);
                                System.out.println("Category added Successfully.");
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (categoryExpenses.isEmpty()) {
                            System.out.println("No expenses recorded yet.");
                        } else {
                            double totalExpense=0;
                            for (String key : categoryExpenses.keySet()) {
                                System.out.printf("%s : %.2f%n",key,categoryExpenses.get(key));
                                totalExpense+=categoryExpenses.get(key);

                            }
                            System.out.printf("Total expense is: Rs.%.2f%n",totalExpense);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the category: ");

                        String category = input.nextLine().trim().toLowerCase();

                        if (categoryExpenses.containsKey(category)) {
                            System.out.printf("%s spend to %.2f%n",category,categoryExpenses.get(category));
                        } else {
                            System.out.println("Category not found.");
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the category: ");

                        String category = input.nextLine().trim().toLowerCase();

                        if (categoryExpenses.containsKey(category)) {
                            categoryExpenses.remove(category);
                            System.out.println(category + " removed successfully.");
                        } else {
                            System.out.println("Category not found.");
                        }
                        break;
                    }
                    case 5: {
                        if (categoryExpenses.isEmpty()) {
                            System.out.println("No expenses recorded yet.");
                        } else {
                            String category = "";
                            double expense = 0;
                            for (String key : categoryExpenses.keySet()) {
                                double currentAmount=categoryExpenses.getOrDefault(key, 0.0);
                                if (expense < currentAmount) {
                                    category = key;
                                    expense =currentAmount;
                                }

                            }
                            System.out.printf("Highest expense by %s : Rs.%.2f%n", category, expense);
                        }
                        break;

                    }
                    case 6: {
                        System.out.println("Goodbye.");
                        keepRunning = false;
                        break;
                    }
                    default: {
                        System.out.println("Enter the valid option.");
                        break;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.");
                input.nextLine();
            } finally {
                System.out.println("=======================");
            }
        }
        input.close();

    }
}

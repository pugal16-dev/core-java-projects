package exceptionhandling;

import java.util.*;

public class AtmApp {
    public static void main(String[] args) {
        AtmAccount obj=null;
    
     obj = new AtmAccount("Pugal", 100);

    Scanner input = new Scanner(System.in);

    boolean keeprunning=true;

    while(keeprunning)
    {
        System.out.println("Select The Option From Menu:\n1.Check Balance\n2.Deposit\n3.Withdraw\n4.Exit");
       
       try{ 
         int inputOption = input.nextInt();
        switch (inputOption) {
            case 1: {
                System.out.printf("Balance Is: Rs.%.2f%n",obj.getBalance());
                break;
            }
            case 2:{
                System.out.println("Enter The Amount:");
                obj.deposit(input.nextDouble());
                break;

            }
            case 3:{
                System.out.println("Enter The Amount To Withdraw: ");
                obj.withdraw(input.nextDouble());
                break;


            }
            case 4:{
                System.out.println("Goodbye");
                keeprunning=false;
                break;
            }
            default:{
                System.out.println("Invalid Option");
            }
        }}
        catch (InputMismatchException e){ System.out.println( "Invalid Input! Please enter numbers only.");
           input.nextLine();
        }
        catch (IllegalArgumentException e){System.out.println("Invalid Amount: "+e.getMessage());}
        catch (InsufficientFundsException e){System.out.println("Transaction Declined: "+e.getMessage());}
        finally{
            System.out.println("==================================");
        }

    }
    input.close();
}

}

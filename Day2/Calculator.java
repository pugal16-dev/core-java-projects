import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepRunning=true;
        while(keepRunning){
            System.out.println("Select The Option from Menu:\n+\n-\n*\n/\nexit");
            String symbol= input.next();
            
            if(symbol.equals("exit")){
                System.out.println("Goodbye");
                break;
            }
            else{
                System.err.println("enter the 1st value: ");
                double input1=input.nextDouble();
                System.err.println("enter the 2nd value: ");
                 double input2=input.nextDouble();

                 switch(symbol){
                    case "+":{
                        System.out.println(input1+input2);
                        break;

                    }
                    case "-":{
                        System.out.println(input1-input2);
                        break;
                    }
                    case "*":{
                        System.err.println(input1*input2);
                        break;
                    }
                    case "/":{
                        System.err.println(input1/input2);
                        break;
                    }
                    default:{
                        System.err.println("Invalid Inputs");
                    }
                 }

            }
        }
    }

    
}

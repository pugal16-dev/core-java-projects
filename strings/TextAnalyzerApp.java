package strings;

import java.util.*;

public class TextAnalyzerApp {
    public static void main(String[] args) {

        StringBuilder textInput = new StringBuilder();
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
        try {

                System.out.println(
                        "Enter the option based on menu:\n1.Word &Character Counter\n2.Reverse Text(menual Logic)\n3.Palindrome Checker\n4.Word Frequency Counter\n5.Exit\n");

                int inputOption = input.nextInt();
                input.nextLine();
                switch (inputOption) {
                    case 1: {
                        while (true) {
                            textInput.setLength(0);
                            System.out.println("Enter the sentence:\n");
                            textInput.append(input.nextLine().trim().toLowerCase());
                            if (!textInput.toString().isEmpty()) {
                                break;
                            }
                            System.out.println("Enter the valid sentence");
                        }

                        System.out
                                .println("Total characters including spaces: " + textInput.toString().length());
                        System.out.println("Total characters excluding spaces: "
                                + textInput.toString().replace(" ", "").length());
                            
                        if(textInput.toString().replaceAll("[^a-z0-9\\s]","").trim().isEmpty()){
                            System.out.println("Total wort count: 0");
                        }else{
                                System.out.println("Total word count: " +textInput.toString().replaceAll("[^a-z0-9\\s]","").trim().split("[\\s+]").length );
                        }

                        break;

                    }
                    case 2: {
                        while (true) {
                            textInput.setLength(0);

                            System.out.println("Enter the sentence:");
                            textInput.append(input.nextLine().trim());
                            if(!textInput.toString().trim().isEmpty()){
                                break;
                            }
                            System.out.println("Invalid input.");
                        }
                        StringBuilder reversedSentence=new StringBuilder();
                        
                        
                        for(int i=textInput.length()-1;i>=0;i--){
                            reversedSentence.append(textInput.charAt(i));
                            
                            
                            
                        }
                        System.out.println("Original sentence: "+textInput+"\nReversed sentence: "+reversedSentence);
                        break;


                    }
                    case 3:{
                        while (true) {
                            textInput.setLength(0);
                            System.out.println("Enter the sentence: ");
                            textInput.append(input.nextLine().trim().toLowerCase());
                            if(!textInput.toString().isEmpty()){
                                break;
                            }
                            System.out.println("Invalid input.");

                            
                        }
                        
                       String cleaned=textInput.toString().replaceAll("[^a-z0-9]", "");
                       String reversed=new StringBuilder(cleaned).reverse().toString();
                     
                      if(!cleaned.isEmpty())  {
                        if(cleaned.equals(reversed)){
                            System.out.println("It is a palindrome");
                         
                        }else{
                            System.out.println("It is not a palindrome");
                         
                        }}else{
                            System.out.println("Invalid input(Special character).");
                        }
                        break;


                    }
                    case 4:{

                        while(true){
                            System.out.println("Enter the sentence:");
                            textInput.setLength(0);
                            textInput.append(input.nextLine().toLowerCase().replaceAll("[^a-z0-9\\s]", "").trim());
                            if(!textInput.toString().isEmpty()){
                                break;
                            }
                            System.out.println("Invalid input.");}
                            HashMap<String, Integer> frequency=new HashMap<>();
                            String[] word=textInput.toString().split("\\s+");
                            for(String oneWord:word){
                        
                                frequency.put(oneWord,frequency.getOrDefault(oneWord,0)+1);
                            }
                            for(String key:frequency.keySet()){
                                System.out.println(key+"  "+frequency.get(key));
                            
                    

                        }
                        break;

                    }
                    case 5:{
                        System.out.println("Goodbye.");
                        keepRunning=false;
                        break;
                    }

                    default:System.out.println("Invalid option.");

                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                input.nextLine();
            } finally
            
            {
                System.out.println("=============================");
            }
            
        }
        input.close();
    }
}

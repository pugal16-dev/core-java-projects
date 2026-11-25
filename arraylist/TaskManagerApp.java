package arraylist;
import java.util.*;

public class TaskManagerApp {
 public static void main(String[] args) {
    ArrayList<Task> tasks=new ArrayList<Task>();
    int nextId=1;
    Scanner input=new Scanner(System.in);

    boolean keepRunnimg=true;

    while(keepRunnimg){
        try{
            System.out.println("Enter The Option From Menu:\n1.Add Task\n2.View All Task\n3.Mark Task Completed\n4.Delete Task\n5.Task Summary\n6.Exit");
            int inputOption=input.nextInt();
            switch(inputOption){
                case 1:{
                   input.nextLine();
                   System.out.println("Enter the task description: ");
                   String description=input.nextLine();
                   if(description.trim().isEmpty()){
                    System.out.println("Enter valid description");

                   }else{
                   tasks.add(new Task(nextId,description));
                   nextId++;
                   System.out.println("Task added successfully.");
                   }
                   break;
                }
                case 2:{
                    if(tasks.isEmpty()){
                        System.out.println("No tasks found");
                    }else{
                        for (Task task : tasks) {
                            task.displayTask();
                            
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter the task id: ");
                    int taskId=input.nextInt();
                    boolean found=false;
                    for (Task task : tasks) {
                        if(task.getId()==taskId){
                            task.markCompleted();
                            System.out.println("Marked as completed");
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Id match not found");
                    }
                    break;
                }
                case 4:{

                    System.out.println("Enter the task id:");
                    int taskId=input.nextInt();
                    boolean found=false;
                    
                    for(int i=0;i<tasks.size();i++){
                        if(tasks.get(i).getId()==taskId){
                            tasks.remove(i);
                            found=true;
                            System.out.println("Task removed successfully.");
                            break;

                            
                        }

                    }
                    if(!found){
                         System.out.println("Id match not found");

                    }
                    break;

                }
                case 5:{
                    int doneCount=0;
                    int pendingCount=0;
                    for(int i=0;i<tasks.size();i++){
                        if(tasks.get(i).isCompleted()){
                            doneCount++;

                        }else{
                            pendingCount++;
                        }
                    }
                    System.out.println("Task summary Total:"+tasks.size()+"\nDone Count: "+doneCount+"\nPending count: "+pendingCount);
                    break;


                }
                case 6:{
                    System.out.println("Goodbye");
                    input.close();
                    keepRunnimg=false;
                    break;
                }
                default:{
                    System.out.println("Enter the valid option");
                    break;
                }
            }

        }catch(InputMismatchException e){System.out.println("Enter integer only");
            input.nextLine();
        }
        finally{
            System.out.println("===================================");
        }
    }

 }   
}

package arraylist;

public class Task {
    private int id;
    private String description;
    private boolean completed;

    public Task(int id,String description){
        this.completed=false;
        this.id=id;
        this.description=description;
    }

    public int getId(){
        return id;
    }
    public  String getDescription(){
        return  description;
    }
    public boolean isCompleted(){
        return  completed;
    }

    public void markCompleted( ){
        this.completed=true;
       
    }
    public  void displayTask(){

     if(completed==true){
        System.out.println("[Done] #"+id+" - " +description);
     }   else{
        System.out.println("[PENDING] #"+id+" -  "+description);
     }
        
    }

    
}

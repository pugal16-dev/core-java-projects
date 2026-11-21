package Day3;

public class Library {

    public static void main(String[] args) {
        Book book1=new Book("Java","Ytt",120.8);
        Book book2=new Book("Python","Rah",-50);
       
        book1.displayInfo( book1.calculateDiscountedPrice(10));
        book2.displayInfo(0);
       




        

    }
    
}

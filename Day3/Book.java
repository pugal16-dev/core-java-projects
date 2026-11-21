package Day3;

public class Book {
    private String title;
    private String author;
    private double price;

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;

        } else {
            System.out.println("The Price Of The book Must Be Posssitive Value");
        }

    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price);

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo(double discountedPrice) {
        System.out.println("The Title Of The Book Is: " + title);
        System.out.println(title + " Writen By " + author);
        System.out.printf("Price Of the book is: Rs.%.2f%n", price);
        System.out.printf("Discounted Price is: Rs. %.2f%n", (price - discountedPrice));
    }

    public double calculateDiscountedPrice(double discountPercent) {

        return price * (discountPercent / 100);
    }

}

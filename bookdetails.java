public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.printDetails();
        Book b2 = new Book("Atomic Habits", "James Clear",250.0);
        b2.printDetails();
        Book b3 = new Book("The Alchemist", "Paulo Coelho", 499.0);
        b3.printDetails();
    }
}
class Book {
    String title;
    String author;
    double price;
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void printDetails() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

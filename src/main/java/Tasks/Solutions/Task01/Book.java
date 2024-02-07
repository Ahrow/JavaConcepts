package Tasks.Solutions.Task01;

public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;
    private int isbn;

    // Constructor
    public Book(String title, String author, double price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}

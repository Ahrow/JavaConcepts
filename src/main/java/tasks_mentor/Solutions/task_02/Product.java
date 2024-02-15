package tasks_mentor.Solutions.task_02;

public class Product {
    private String productName;
    private double price;
    private int quantityInStock;
    private final int productId;

    // Constructor
    public Product(String productName, double price, int quantityInStock, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.productId = productId;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getProductId() {
        return productId;
    }
}
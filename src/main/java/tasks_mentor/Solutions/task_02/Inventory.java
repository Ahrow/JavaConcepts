package tasks_mentor.Solutions.task_02;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Product> products;

    // Constructor
    public Inventory() {
        products = new ArrayList<>();
    }

    // Add a new product to the inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Update the stock quantity for a specific product
    public void updateStock(int productId, int newQuantity) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.setQuantityInStock(newQuantity);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    // List all the products in the inventory
    public void listInventory() {
        for (Product product : products) {
            System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName() +
                    ", Price: $" + product.getPrice() + ", Stock: " + product.getQuantityInStock());
        }
    }
}

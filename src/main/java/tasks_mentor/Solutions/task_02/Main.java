package tasks_mentor.Solutions.task_02;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Creating and adding products
        inventory.addProduct(new Product("Laptop", 1200.00, 10, 1));
        inventory.addProduct(new Product("Smartphone", 700.00, 15, 2));
        inventory.addProduct(new Product("Tablet", 450.00, 8, 3));

        // List all products
        System.out.println("Current Inventory:");
        inventory.listInventory();

        // Update the stock quantity of a product
        System.out.println("\nUpdating stock quantity for Product ID 2...");
        inventory.updateStock(2, 20);

        // Show the updated inventory
        System.out.println("Updated Inventory:");
        inventory.listInventory();
    }
}

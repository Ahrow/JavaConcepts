package Concepts.Polymorphism.MethodOverload;

/**
 * Compile-time Polymorphism is another form of polymorphism.
 * Multiple methods have the same name but different parameters
 * within the same class.
 * It allows methods to be called with different argument types and counts
 */
public class DisplayOverload {
    public void display(String data) {
        System.out.println("String: " + data);
    }
    public void display(int data) {
        System.out.println("Integer: " + data);
    }
    public void display(String data, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("String: " + data + ", Count: " + count);
        }
    }

    public static void main(String[] args) {
        DisplayOverload demo = new DisplayOverload();

        // Calling display with a String argument
        demo.display("Hello, World!");

        // Calling display with an Integer argument
        demo.display(10);

        // Calling display with a String and an Integer argument
        demo.display("Repeat", 3);
    }
}

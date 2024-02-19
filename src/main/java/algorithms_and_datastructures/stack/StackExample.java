package algorithms_and_datastructures.stack;
/**
 * https://www.geeksforgeeks.org/stack-push-method-in-java/
 * */
import java.util.Stack;

public class StackExample {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<Integer> STACK = new Stack<Integer>();

        // Use push() to add elements into the Stack
        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);
        STACK.push(null);

        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);

        // Pushing elements into the Stack
        STACK.push(1254);
        STACK.push(4521);

        // Displaying the final Stack
        System.out.println("Final Stack: " + STACK);
    }
}

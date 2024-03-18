package algdat_lab_practice.problem_3;

public class Stack {
    // Implement push operation of the stack in java
    // Implement pop operation of the stack in java
    private int[] elements; // Array to store stack elements
    private int size; // Current size of stack
    private int capacity; // Max cap of stack

    // Constructor to initialize the stack with max cap
    public Stack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        size = 0;
    }
    // Push Operation
    public void push(int element) {
        if (size == capacity) {
            System.out.println("Stack full!");
        } else {
            elements[size] = element;
            size++;
        }
    }
    // Pop operation
    public int pop() {
        if (size == 0) {
            System.out.println("Stack Empty!");
            return Integer.MIN_VALUE; // Indicative value for error condition
        } else {
            int topElement = elements[size -1];
            size--;
            return topElement;
        }
    }
    public  boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Current stack size: " + stack.getSize());
    }
}

package algorithms_and_datastructures.stack.building_a_stack_class_in_java;
// https://levelup.gitconnected.com/selfmade-stack-class-in-java-d401dc7d68f0
class Stack<T> implements Stackable<T>{
    // As next, we create the stack class.
    // Here we need two private attributes: previous and value.
    // previous is a reference to the item that is located below the current instance in the stack order (the underlying item).
    // This results in a recursive implementation.
    // The value attribute contains the value that the current instance of stack stores. It can be any data type.
    // Moreover, there are multiple constructors we need later on.
    // Since the class is generic we need here the <T> construct as well.

    private Stack<T> previous;
    private T value;


    Stack() {}

    Stack(T value) {
        this.value = value;
    }

    Stack(Stack<T> previous, T value) {
        this.previous = previous;
        this.value = value;
    }

    // This method pushes an item onto the top of the stack.
    // Therefor, we set the current instance of stack to our previous one and store the new value.
    // previous references now to our old stack instance.
    @Override
    public void push(T value) {
        this.previous = new Stack<>(this.previous, this.value);
        this.value = value;
    }
    // This method removes the item at the stack’s top and returns its value.
    // First of all we store the current value in a temporary variable because it gets overwritten, and we need to return it later.
    // Afterward, we set the current value to the one from our previous stack item.
    // Moreover, we reference the current: previous attribute to the previous item of the underlying item.
    // At the end, we return the removed value.
    @Override
    public T pop() {
        if (this.isEmpty())
            throw new IllegalArgumentException("Stack is empty!");
            T top = this.value;
            this.value = this.previous.value;
            this.previous = this.previous.previous;
            return top;
    }
    // This method looks at the value of the item at the top of the stack and returns it.
    // Here we just need to return this.value.
    @Override
    public T peek() {
        return this.value;
    }
    // This method tests if the stack is empty.
    // Since the last stack item has no reference to another (underlying) item, we just need to check if the previous item is null.
    @Override
    public boolean isEmpty() {
        return this.previous == null;
    }
    // This method returns number of items in our stack. Here, we recursively count until the last item is reached
    @Override
    public int size() {
        return this.isEmpty() ? 0 : 1 + this.previous.size();
    }
    // This method returns the 1-based position where an item is on the stack.
    // Therefor, we loop over all our stack items and increase a counter until the one that equals the target item is reached.
    // Last but not least we return the counter.
    // If there is no match, -1 is returned.
    @Override
    public int search(Object o) {
        int count = 1;
        for (Stack<T> stack = this; !stack.isEmpty(); stack = stack.previous) {
            if(stack.value.equals(o))
                return count;
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty()); // true

        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(16);
        System.out.println("Stack size: " + stack.size()); // 4
        System.out.println("Stack peek: " + stack.peek()); // 16
        stack.pop();
        System.out.println("Stack peek after pop: " + stack.peek()); // 7

        System.out.println(stack.search(16)); // -1
        System.out.println(stack.search(2)); // 3
        System.out.println(stack.search(5)); // 2
        System.out.println(stack.search(7)); // 1
    }
}

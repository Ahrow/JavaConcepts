package algorithms_and_datastructures.stack.building_a_stack_class_in_java;

interface Stackable<T> {
    // The <T> construct marks the interface as generic.
    // In this case T can be any data type.
    // For example Integer or String.
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    int search(Object o);
}

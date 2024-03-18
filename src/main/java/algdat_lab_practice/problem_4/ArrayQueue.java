package algdat_lab_practice.problem_4;
class ArrayQueue {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = elements[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue size before D-Q: " + queue.size);
        System.out.println(queue.dequeue());
        System.out.println("Queue size after D-Q: " + queue.size);

    }
}

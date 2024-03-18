package algdat_lab_practice.problem_4;

import java.util.LinkedList;

public class LinkListQueue {
    private Node front, rear;

    public LinkListQueue() {
        this.front = this.rear = null;
    }

    // enqueue
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(item + " enqueued to queue");
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(item + " enqueued to queue");
    }

    // dequeue
    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        LinkListQueue queue = new LinkListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
    }
}

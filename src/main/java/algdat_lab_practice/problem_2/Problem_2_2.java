package algdat_lab_practice.problem_2;
/** Problem 2.1: Insert an element using:
 * • Doubly linked list
 * */
public class Problem_2_2 {
    // S = [10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73]
    int x = 134;
    class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    class DoublyLinkedList {
        Node head;
        Node tail;
        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertAtBeginning(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Problem_2_2 problem = new Problem_2_2();
        DoublyLinkedList list = problem.new DoublyLinkedList();
        int[] arr = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
        for (int value : arr) {
            list.insertAtBeginning(value);
        }
        list.insertAtBeginning(problem.x);
        list.printList();
    }
}

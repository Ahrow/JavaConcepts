package algorithms_and_datastructures.circular_linked_list;
/** <a href="https://www.geeksforgeeks.org/circular-linked-list/">...</a>
 * The circular linked list is a linked list where all nodes are connected to form a circle.
 * In a circular linked list, the first node and the last node are connected to each other which forms a circle.
 * There is no NULL at the end.
 * */

public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
    }
    // Function to insert a node at the beginning of a Circular linked list
    static Node push(Node head_ref, int data){
        // Create a new node and make head as next
        // of it.
        Node point = new Node();
        point.data = data;
        point.next = head_ref;

        if(head_ref != null) {
            // Find the node before head and update
            // next of it.
            Node temp = head_ref;
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = point;
        } else
            point.next = point; // For the first node
            head_ref = point;
            return head_ref;
        }
    /* Function to print nodes in a given
        circular linked list */
    static void printList(Node head)
    {
        Node temp = head;
        if (head != null) {
            do {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            } while (temp != head);
        }

        System.out.printf("\n");
    }

    /* Function to delete a given node from the list */
    static Node deleteNode(Node head)
    {
        if (head == null)
            return null;
        int flag = 0;
        // Find the required node
        Node curr = head, prev = new Node();
        while (curr.data != 7) {
            if (curr.next == head) {
                System.out.print(
                        "Given node is not found in the list!!!\n");
                flag = 1;
                break;
            }

            prev = curr;
            curr = curr.next;
        }

        // Check if the element is not present in the list
        if (flag == 1)
            return head;

        // Check if node is only node
        if (curr == head && curr.next == head) {
            head = null;
            return head;
        }

        // If more than one node, check if
        // it is first node
        if (curr == head) {
            prev = head;
            while (prev.next != head)
                prev = prev.next;
            head = curr.next;
            prev.next = head;
        }

        // check if node is last node
        else if (curr.next == head) {
            prev.next = head;
        }
        else {
            prev.next = curr.next;
        }
        return head;
    }

    /* Driver code */
    public static void main(String[] args)
    {
        /* Initialize lists as empty */
        Node head = null;

        /* Created linked list will be 2.5.7.8.10 */
        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 10);

        System.out.print("List Before Deletion: ");
        printList(head);

        head = deleteNode(head);

        System.out.print("List After Deletion: ");
        printList(head);
    }
}


package AlgdatLabPractice.Problem2;
// Linked List Data Structures
/** Problem 2.1: Insert an element using:
 * • Singly linked list
 * • Doubly linked list
 * • Circular singly linked list
 * • Circular doubly linked list
 * */
public class SinglyLinkedList {
    // S = [10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73]
    static int x = 109;
    static class Node
    {
        int data;
        Node next;
    };

    // Function to insert node
    static Node insert(Node root, int item)
    {
        Node temp = new Node();
        Node ptr;
        temp.data = item;
        temp.next = null;

        if (root == null)
            root = temp;
        else
        {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    static void display(Node root)
    {
        while (root != null)
        {
            System.out.print( root.data + " ");
            root = root.next;
        }
    }

    static Node arrayToList(int[] arr, int n)
    {
        Node root = null;
        for (int i = 0; i < n; i++)
            root = insert(root, arr[i]);
        return root;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73 };
        int n = arr.length;
        Node root = arrayToList(arr, n);
        root = insert(root, x); // add x to the end
        display(root);
    }
}



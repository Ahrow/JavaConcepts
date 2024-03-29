package algdat_lab_practice.problem_2;
// Linked List Data Structures

import java.util.LinkedList;

/** Problem 2.1: Insert an element using:
 * • Singly linked list
 * • Doubly linked list
 * • Circular singly linked list
 * • Circular doubly linked list
 * */
public class Problem_2_1 {
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

    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73 };
        int n = arr.length;
        Node root = arrayToList(arr, n);
        root = insert(root, x); // add x to the end
        System.out.println("\nAdvanced method: ");
        display(root);

        // Easy way
        LinkedList<Integer> numbers = new LinkedList<>();
        int[] arrNumbers = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
        for(int i : arrNumbers) {
            numbers.add(i);
        }
        numbers.addFirst(x); // add X to the beginning
        System.out.println("\nJava built in LinkedList<> method: ");
        System.out.println(numbers);
    }
}



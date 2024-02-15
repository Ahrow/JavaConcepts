package algdat_lab_practice.problem_2;
/** Problem 2.3: Insert an element using:
 * • Circular singly linked list
 * */
public class Problem_2_3 {
    // S = [10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73]
    static class Node{
        int data;
        Node next;
        static Node push(Node head_ref, int data){
            Node point = new Node();
            point.data = data;
            point.next = head_ref;

            if(head_ref != null) {
                Node temp = head_ref;
                while (temp.next != head_ref)
                    temp = temp.next;
                temp.next = point;
            } else {
                point.next = point;
                head_ref = point;
            }
            return head_ref;
        }

        static void printList(Node head){
            Node temp = head;
            if (head != null) {
                do {
                    System.out.println(temp.data);
                    temp = temp.next;
                } while (temp != head);
            }
            System.out.println("\n");
        }

        public static void main(String[] args) {
            int x = 930; // element to insert
            int[] arr = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
            Node head = null;
            for (int value : arr) {
                head = push(head, value);
            }
            head = push(head,x); // insert x
            printList(head);
        }
    }
}

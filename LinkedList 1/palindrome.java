import java.util.Scanner;

public class palindrome {

    private static Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // To print ll
    public static void printll() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.err.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    

    // To Find mid
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

         while(fast != null && fast.next != null){
            slow = slow.next;   // +1
            fast = fast.next.next;      // +2
         }
         return slow;
    }


    // Actual code
    public static boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // step 1: Find mid
        Node miNode = findMid(head);

        // step 2: Reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;      // right side head
        Node left = head;

        // step 3: Check if left and right are equal
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindrome ll = new palindrome();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        // System.out.println("Original LL: ");
        printll();

        System.out.println("Palindrome Check: " + checkPalindrome());
        
    }
}

import java.util.Scanner;

public class removeCycle {

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



    // Detect Loop cycle in LL
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    

    // remove cycle
    public static void removeCycle(){
        // 1. Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow= slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        
        // find meeting point
        slow = head;
        Node prev = null;   // last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle: last node -> next = null
        prev.next = null;

    } 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        removeCycle ll = new removeCycle();

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;             // 1->2->3->2

        System.out.println("Is cycle present: " + isCycle());
        
        removeCycle();

        System.out.println("Is cycle present: " + isCycle());
    }
}

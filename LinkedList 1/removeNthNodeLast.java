import java.util.Scanner;

public class removeNthNodeLast {

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

    // Remove Nth Node
    public static void removeNthNodeLast(int n) {
        // calculate size of LL
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // if there is one node and we have to delete the first head node
        if (n == sz) {
            head = head.next;
            return;
        }

        // to reach the prev node of which we have to remove: sz - n
        int i = 0;
        int iToFind = sz - n - 1; // prev before the node to delete
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        removeNthNodeLast ll = new removeNthNodeLast();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        System.out.println("Original LL: ");
        printll();

        int n = 2;
        removeNthNodeLast(n);

        System.out.println("LL after removing the " + n + "th node from the end: ");
        printll();
    }
}

import java.util.Scanner;

public class iterativeRecursiveSearch {

    private Node head;

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



    // Recursive Search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int ind = helper(head.next, key);
        if (ind == -1) {
            return -1;
        }
        return ind + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iterativeRecursiveSearch ll = new iterativeRecursiveSearch();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        System.out.println("Key is present at Index: " + ll.recursiveSearch(3));
        System.out.println("Key is present at Index: " + ll.recursiveSearch(10));
    }
}

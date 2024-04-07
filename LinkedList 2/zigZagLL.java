import java.util.Scanner;
import java.util.LinkedList;

public class zigZagLL {

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

    // To print ll
    public void printll() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    private void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next; 
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextL, nextR;

        // zig zag (alternate merging)
        while (leftHead != null && rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        zigZagLL ll = new zigZagLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // 1->2->3->4->5->6->null

        ll.printll();
        ll.zigZag();
        ll.printll();
    }
}

// Output:
// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
// 1 -> 6 -> 2 -> 5 -> 3 -> 4 -> null

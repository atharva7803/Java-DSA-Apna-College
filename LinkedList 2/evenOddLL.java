// Odd Even Linked List
// We have a LinkedList of integers,write a function to modify the linkedlist such that all even numbers appear 
// before all the odd numbers in the modified linkedlist. Also, keep the order of even and odd numbers same.
// Sample Input 1: 8->12->10->5->4->1->6->NULL
// Sample Output 1: 8->12->10->4->6->5->1->NULL
// Sample Input 2: 1->3->5->7->NULL
// Sample Output 2:1->3->5->7->NULL

import java.util.Scanner;
import java.util.LinkedList;

public class evenOddLL {

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
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
        public static Node evenOdd(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
    
            Node evenDummy = new Node(0);
            Node oddDummy = new Node(0);
            Node evenTail = evenDummy;
            Node oddTail = oddDummy;
    
            Node current = head;
    
            while (current != null) {
                if (current.data % 2 == 0) {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
                current = current.next;
            }
    
            evenTail.next = oddDummy.next;
            oddTail.next = null;
    
            return evenDummy.next;
        }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        evenOddLL ll = new evenOddLL();

        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);

        System.out.print("Sample Input 1: ");
        printll();

        head = evenOdd(head);

        System.out.print("Sample Output 1: ");
        printll();
    }
}


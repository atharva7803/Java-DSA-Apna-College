import java.util.LinkedList;
import java.util.Scanner;

public class reverseLL {

    private static Node head;
    private static reverseLL.Node tail;

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


    // to print ll
    public static void printll(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.err.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
     


    // Reverse LL
    public static void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        reverseLL ll = new reverseLL();

        ll.addFirst(2);         // For adding node at index 
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        System.out.println(" Normal LL: ");
        printll();

        reverseLL();
        System.out.println("Reverse LL: ");
        printll();
    }
}
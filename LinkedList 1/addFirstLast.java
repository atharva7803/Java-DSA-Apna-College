import java.util.LinkedList;
import java.util.Scanner;
public class addFirstLast {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }       
    }

    public static Node head;
    public static Node tail;

    public static int size;     // to calculate the size of ll


    // 1. Add node at first
    public void addFirst(int data){
        // step 1: Create new node
        Node newNode = new Node(data);
        size++;

        // for single node
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2: New node's nxt -> head
        newNode.next = head;
        
        // step 3: head = new node
        head = newNode;
    }


    // 2. Add node at last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // 3.To add node in middle or at any index
    public void addIndex(int ind, int data){
        if(ind == 0){           // for index = 0
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < ind-1){
            temp = temp.next;
            i++;
        }
        // Now it becomes: i = i-1, where temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // 4. Remove node at first
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;     // -infinity
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;                 // size will reduce after removing
        return val;
    }


    // 5. Remove node at last
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;     // -infinity
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 0; i < size-2; i++){    // size-2 : last node = size-1 and secondlast node size-2 which will be prev node
            prev = prev.next;
        }

        int val = tail.data;    // or val = prev.next.data
        prev.next = null;
        tail = prev;
        size--;                 // size will reduce after removing
        return val;
    }



    // to print ll
    public void printll(){
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
     

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        addFirstLast ll = new addFirstLast();

        // ll.printll();               // For printing ll
        // ll.addFirst(2);
        // ll.printll();
        // ll.addFirst(1);
        // ll.printll();
        // ll.addLast(3);
        // ll.printll();
        // ll.addLast(4);
        // ll.printll();

        // Output: 
        // null
        // 2 -> null
        // 1 -> 2 -> null
        // 1 -> 2 -> 3 -> null
        // 1 -> 2 -> 3 -> 4 -> null


        ll.addFirst(2);         // For adding node at index 
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.addIndex(2, 7);

        ll.printll();

        // Output:
        // 1 -> 2 -> 7 -> 3 -> 4 -> null

        System.out.println("The size of LinkeList is: " + size);

        ll.removeFirst();
        ll.printll();
        System.out.println("The size of LinkeList is: " + size);
        
        // Output: 
        // 2 -> 7 -> 3 -> 4 -> null
        // The size of LinkeList is: 4

        ll.removeLast();
        ll.printll();
        System.out.println("The size of LinkeList is: " + size);

        // Output:
        // 2 -> 7 -> 3 -> null
        // The size of LinkeList is: 3
    }
}
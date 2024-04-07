import java.util.Scanner;

public class queueLinkedList {

    // Queue implementation using LinkedList

    public static class Node {    
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {

        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add elem in queue
        public static void add(int data) { 
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove elem
        public static int remove() { 
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int front = head.data;
            if (head == tail) { // only one element present in the queue
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data; // return first elem
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

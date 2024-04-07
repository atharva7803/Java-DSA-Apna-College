import java.util.Scanner;
public class circularQueue {

    // Circular Queue implementation using array

    public static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        // add elem in queue        
        public static void add(int data){       // TC - O(1 )
            if(isFull()){         // when rear reaches to end elem of queue 
                System.out.println("Queue is Full!");
                return;
            }

            // add 1sr element
            if(front == -1){
                front = 0;
            }

            rear = (rear + 1) % size;        // to move rear further from -1 to 0 index of arr
            arr[rear] = data;
        }


        // remove elem
        public static int remove(){     // TC - O(n)
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }

            int result = arr[front];
            // last elem delete
            if(rear == front){
                rear = front = -1;      // both are -1 means empty queue
            }
            else{
                front = (front + 1) % size;   // to bring next elem at front and show that we have removed one elem
            }
            return result;       // return the removed elem
        }


        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];      // return first elem
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
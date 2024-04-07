import java.util.Scanner;
import java.util.Stack;

public class queue2Stack {

        static class Queue{
            static Stack <Integer> s1 = new Stack<>();
            static Stack <Integer> s2 = new Stack<>();

            public static boolean isEmpty(){
                return s1.isEmpty();
            }

            // add
            public static void add(int data) {
                while(!s1.isEmpty()){            // until s1 is not empty move elem to s2
                    s2.push(s1.pop());
                }

                s1.push(data);                   // push new incoming elem in s1

                while (!s2.isEmpty()) {          // until s1 is not empty move elem back to s1
                    s1.push(s2.pop());
                }
            }

            // remove
            public static int remove() {
                if(isEmpty()){
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                return s1.pop();               // remove from front of s1
            }

            // peek
            public static int peek() {
                if(isEmpty()){
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                return s1.peek();
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

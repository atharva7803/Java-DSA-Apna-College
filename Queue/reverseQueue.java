import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class reverseQueue {

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Queue<Integer> q = new LinkedList<>();   

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
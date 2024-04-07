import java.util.*;


public class queueJCF {     // Queue using Java Collection Framework

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();    //  Create a queue using LinkedList from JCF
        // Queue<Integer> q = new ArrayDeque<>();    //  Create a queue using ArrayDeque from JCF


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

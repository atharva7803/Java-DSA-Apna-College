import java.util.LinkedList;    // using java collection framework: already built in
public class LLcollectionFramework {
    public static void main(String[] args) {
        // create: can store only object | cant use int, float, boolean | Have to use Integer, Float... Class
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        

        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    
    }
}
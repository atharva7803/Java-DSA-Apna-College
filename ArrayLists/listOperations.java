import java.util.ArrayList;
import java.util.Scanner;
public class listOperations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Float> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        // add Operation
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(1);        

        list.add(1, 4);   // O(n)
        System.out.println(list);

        // Get operation
        int element = list.get(2);
        System.out.println(element);

        // Remove operation
        list.remove(3);
        System.out.println(list);

        // set operation
        list.set(0, 6);
        System.out.println(list);

        // contains operation
        System.out.println(list.contains(5));
        System.out.println(list.contains(10));

    }
}
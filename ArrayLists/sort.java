import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);

        
        System.out.println("Before Sorting: "+ list);

        Collections.sort(list);
        System.out.println("After Sorting: "+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Sorting: "+ list);
    }
}
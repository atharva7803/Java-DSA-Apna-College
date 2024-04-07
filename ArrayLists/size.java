import java.util.ArrayList;
import java.util.Scanner;
public class size {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Size of arraylist is: " + list.size());

        // to print ArrayList
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
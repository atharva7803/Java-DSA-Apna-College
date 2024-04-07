import java.util.ArrayList;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // to print reverse ArrayList - O(n)
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
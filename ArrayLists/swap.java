import java.util.ArrayList;
import java.util.Scanner;
public class swap {

    public static void swap(ArrayList<Integer> list, int ind1, int ind2){
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(40);
        list.add(35);
        list.add(70);
        list.add(57);

        int ind1 = 2, ind2 = 4;
        System.out.println(list);

        swap(list, ind1, ind2);
        System.out.println(list);
    }
}
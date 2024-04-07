import java.util.ArrayList;
import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);

        int max = Integer.MIN_VALUE;
        // to print ArrayList
        for(int i = 0; i < list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }  Or
            max  = Math.max(max, list.get(i));
        }
        System.out.println("Max element is: "+ max);
    }
}
import java.util.ArrayList;
import java.util.Scanner;
public class pairSum1 {

    // public static boolean pairSum1(ArrayList<Integer> list, int target){    // Brute force  O(n2)
    //     for(int i = 0; i < list.size(); i++){
    //         for(int j = i+1; j < list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean pairSum1(ArrayList<Integer> list, int target){    // Linear  O(n)
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;

        System.out.println(pairSum1(list, target));
    }
}
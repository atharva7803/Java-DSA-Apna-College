import java.util.ArrayList;
import java.util.Scanner;
public class pairSum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target){    // Linear  O(n)

        int bp = -1;    // breaking point
        int n = list.size();
        
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){     // here we get bp
                bp = i;
                break;
            }
        }

        int lp = bp+1;    // smallest no
        int rp = bp;      // largest no  

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){      // case 1
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){       // case 2
                lp = (lp+1) % n;
            }
            else{
                rp = (n+rp-1) % n;                          // case 3
            }
        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        ArrayList<Integer> list = new ArrayList<>();
        // 11 15 6 8 9 10 - Sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}
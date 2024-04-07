// Calculate power
import java.util.Scanner;
public class tiling {

    public static int tiling(int n){     //2*n floor 
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tiling(n-1);   // xnm1: x raies to n-1
        int fnm2 = tiling(n-2);
        int totalWays = fnm1 +fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(tiling(4));
    }
}
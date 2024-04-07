// To calculate the no of ways that how we can pair friends in party
import java.util.Scanner;
public class friendsPairing {

    public static int friendsPairing(int n){
        if(n ==1 || n == 2){
            return n;
        }

        // // single
        // int fnm1 = friendsPairing(n-1);

        // // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        // OR

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(friendsPairing(3));
    }
}
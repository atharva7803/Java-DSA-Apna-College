// Calculate power
import java.util.Scanner;
public class xPowerNoptimized {

    public static int optimizedPower(int x, int n){     // TC = O(logn)
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // For odd n
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(optimizedPower(2, 10));
    }
}
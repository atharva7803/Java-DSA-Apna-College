// Calculate power
import java.util.Scanner;
public class xPowerN {

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);   // xnm1: x raies to n-1
        int xn = x * xnm1;
        return xn;

        // Or return x * power(x,n-1)
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(power(2, 10));
    }
}
// Print no in decreasing order using recursion
import java.util.Scanner;
public class increasingOrder {

    public static void dec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        dec(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        dec(10);
    }
}
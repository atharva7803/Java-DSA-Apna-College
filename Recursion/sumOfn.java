import java.util.Scanner;
public class sumOfn {

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = sum(n-1);   // fnm1 : sum of n - 1
        int sn = n + sum(n-1);
        return sn;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Sum of number upto n is: " +sum(3));
    }
}
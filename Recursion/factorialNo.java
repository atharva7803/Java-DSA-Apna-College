import java.util.Scanner;
public class factorialNo {

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);   // fnm1 : factorial of n - 1
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Factorial of number is: " +fact(5));
    }
}
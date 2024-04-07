import java.util.Scanner;
public class fibonacciSeries {

    public static int Fib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fibnm1 = Fib(n-1);   // fnm1 : sum of n - 1
        int fibnm2 = Fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Fibonacci series upto n number is: " +Fib(6));
    }
}
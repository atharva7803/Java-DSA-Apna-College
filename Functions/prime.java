import java.util.Scanner;
public class prime {

    public static boolean isPrime(int n){          // Output: To check prime no.
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;    
    }

    public static void primeRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i+"");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

        primeRange(10);
    }
}
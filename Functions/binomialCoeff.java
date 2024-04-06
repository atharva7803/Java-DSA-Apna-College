import java.util.Scanner;

public class binomialCoeff {

    // Factorial function
    public static int factorial(int n){
        int f = 1;   
    
        for(int i = 1; i <= n; i++ ){
            f = f * i;
        }
        return f;
    }

    // Binomial factorial function  
    public static int binoCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        
        int binoCoeff = fact_n / (fact_r * fact_nmr);

        return binoCoeff;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println(binoCoeff(5, 2));
    }
}
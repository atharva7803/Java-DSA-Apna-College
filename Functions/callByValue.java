import java.util.Scanner;
public class callByValue {

    public static void swap(int a, int b){
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

        int a = 5;
        int b = 10;
        swap(a,b);     // Output: a = 10 and b = 5

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);    // output : Here it will return original value which is a = 5 and b = 10.

    }
}
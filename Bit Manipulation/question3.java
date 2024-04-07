// Question 3 :Add 1 to an integer using Bit Manipulation.(Hint: try using Bitwise NOT Operator)
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int x = 7;
        System.out.println(x + " + " + 1 + " = " + -~x);

        int y = -4;
        System.out.println(y + " + " + 1 + " = " + -~y);

        int z = 0;
        System.out.println(z + " + " + 1 + " = " + -~z);
    }
}

// Output:
// 7 + 1 = 8
// -4 + 1 = -3
// 0 + 1 = 1
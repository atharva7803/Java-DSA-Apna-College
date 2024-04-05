// Question 4 :What will be the value of x & y in thefollowing program:

public class question4{
    public static void main(String args[]) {
        int a=63,b=36;
        boolean x= (a < b) ? true : false;
        int y= (a > b) ? a : b;

        System.out.println(x);
        System.out.println(y);
    }
}

// Output: x = false and y = 63
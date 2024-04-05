import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter 2 numbers for operation: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

            case '%':
                System.out.println(a%b);
                break;

            default:
                System.out.println("Enter valid operator!!!");

        }

    }
}
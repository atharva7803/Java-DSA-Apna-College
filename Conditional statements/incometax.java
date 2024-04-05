import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Salary: ");
            int salary = sc.nextInt();
            float tax;

            if(salary < 500000) {
                tax = 0; 
            }

            else if(salary > 500000 && salary < 1000000) {
                tax = (salary * 0.2f);
            }

            else{
                tax = (salary * 0.3f);
            }

            System.out.println("Your tax will be: " + tax);
        }
    }
}
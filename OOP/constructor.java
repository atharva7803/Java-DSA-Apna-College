import java.util.Scanner;
public class constructor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Student s1 = new Student();
    }
}

class Student{
    String name;
    int roll;

    Student(){    //constructor
        System.out.println("Constructor is called...");
    }
}
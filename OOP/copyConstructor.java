import java.util.Scanner;
public class copyConstructor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Student s1 = new Student();
        s1.name = "Atharva";
        s1.roll = 7;    
        s1.password = "abcd";

        Student s2 = new Student(s1);
        s2.password = "xyz";
    }
}

class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(){    //constructor
        System.out.println("Constructor is called...");
    }
}
import java.util.Scanner;
public class constructorTypes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Student s1 = new Student();
        Student s2 = new Student("Atharva");
        Student s3 = new Student(10);
    }
}

class Student{
    String name;
    int roll;

    Student(){    //constructor
        System.out.println("Constructor is called...");
    }

    Student(String name){    // Parameterized constructor
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
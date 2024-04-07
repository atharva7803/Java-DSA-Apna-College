import java.util.Scanner;
public class oop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Pen p1 = new Pen();    // Using new keyword we make space in memeory where all properties of pen are stored
        // classname penName = new constructor  (p1 is object)
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float cgpa;

    void calcCgpa(int phy, int chem, int maths){
        cgpa = (phy + chem + maths)/3;
    }
}
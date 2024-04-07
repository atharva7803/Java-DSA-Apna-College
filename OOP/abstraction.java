import java.util.Scanner;
public class abstraction {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);    // Output: Brown , bcz its of parent class (superclass) constructor

        Chicken c = new Chicken();
        h.walk();
        h.eat();
        System.out.println(c.color);
        
    }   
}

abstract class Animal{
    String color; 

    Animal(){
        color = "Brown";
    }
    void eat(){
        System.out.println("Eats");
    }

    abstract void walk();    // Abstract function does not consist of implementation, It gives only idea
}

class Horse extends Animal{

    void changeColor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("Walks on 4 legs");   // Its implementation of the above idea
    }
}

class Chicken extends Animal{

    void changeColor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
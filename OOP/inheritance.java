import java.util.Scanner;
public class inheritance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base class or Parent class
class Animal{

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathe");
    }
}

// Derived class or subclass
class Fish extends Animal{

    int fins;

    void swim(){
        System.out.println("Swims");
    }
}
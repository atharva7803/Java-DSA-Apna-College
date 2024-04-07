import java.util.Scanner;
public class multilevelInheritance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Dog husky = new Dog();
        husky.eat();
        husky.legs = 4;
        System.out.println(husky.legs);
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

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
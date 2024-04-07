import java.util.Scanner;
public class constructorHierarchy {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Mustang m = new Mustang();
        // Hierarchy: Animal -> Horse -> Mustang     
    }   
}

abstract class Animal{
    String color; 

    Animal(){
        System.out.println("Animal constructor called...");
    }
    void eat(){
        System.out.println("Eats");
    }

}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called...");
    }

    void walk(){
        System.out.println("Walks on 4 legs");   // Its implementation of the above idea
    }
}

class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang constructor called...");
    }
}


// Output:
// Animal constructor called...     Hence animla constructor will called first.ss
// Horse constructor called...
// Mustang constructor called...

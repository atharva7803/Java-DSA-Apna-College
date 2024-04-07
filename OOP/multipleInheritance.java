// Implementation of multiple inheritance using interface in java
import java.util.Scanner;
public class multipleInheritance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Animal a = new Animal();
        a.walks();
        a.fly();
        a.swims();
    }
}

interface walkable{
    void walks();
}

interface flyable{
    void fly();
}

interface swimable{
    void swims();
}

class Animal implements walkable, flyable, swimable{
    public void walks(){
        System.out.println("Animal is walking");
    }

    public void fly(){
        System.out.println("Animal is flying");
    }

    public void swims(){
        System.out.println("Animal is swimming");
    }
}
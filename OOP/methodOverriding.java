import java.util.Scanner;
public class methodOverriding {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Deer{
    void eat(){
        System.out.println("Eats Grass");
    }
}


// Output: Eats Grass
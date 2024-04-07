import java.util.Scanner;
public class superPrg {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Horse h = new Horse();
    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor is called...");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called...");
    }
}
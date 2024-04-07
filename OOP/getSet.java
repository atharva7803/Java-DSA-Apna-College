import java.util.Scanner;
public class getSet {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Pen p1 = new Pen();    // Using new keyword we make space in memeory where all properties of pen are stored
        // classname penName = new constructor  (p1 is object)
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){        // get : It is used to return the value
        return this.color;    // this keyword is used to refer the current object
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){     // set: It is used to modify the value
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


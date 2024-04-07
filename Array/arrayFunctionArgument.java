// Implementation of Array as function argument

import java.util.Scanner;
public class arrayFunctionArgument {

    public static void update(int marks[]){
        // Add 1 mark
        for(int i = 0; i <= marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        int marks[] = {95,96,97};
        update(marks);

        for(int i = 0; i <= marks.length; i++){
            System.out.println("Marks: "+ marks[i]);
        }
        System.out.println();
    }
}
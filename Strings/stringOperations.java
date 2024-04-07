// Implementation of String Operations

public class stringOperations {

    public static void printLetter(String str) {
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public  static void main(String[] args) {


        //Strings in java
        String name = "Atharva";
        String surname = "Bhoite";
        String fullName = name + " " + surname;

        printLetter(fullName);

        System.out.println(fullName);

        // System.out.println(name);                   //print name
        // System.out.println(name + " " + surname);   //concatenate name and surname
        System.out.println(name.charAt(1));  //charAt() : gives index of the character  
        System.out.println(name.length());         //lenght() : gives lenght of the string

        //replaces the character
        /* String name2 = name.replace(oldChar:'h' , newChar:'c');
        System.out.println(name2); */
         
        String name3 = "Aman and akku";                                  //Substring
        System.out.println(name3.substring(0,5));
        System.out.println(name3.substring(5,8));
        System.out.println(name3.substring(8,13));
    }
}
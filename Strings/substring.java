// Substring

import java.util.Scanner;
public class substring {

    public static String subString(String str, int si, int ei){    // si = starting index, ei = ending index
        String substr = "";
        for(int i = 0 ; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        String str;
        System.out.println("Enter the string: ");
        str = sc.nextLine();
        System.out.println("Substring is: ");
        System.out.println(subString(str, 0, 5));    // Output: Hello

        // There's a built in function for substring in java
        System.out.println(str.substring(0, 5));    // Output: Hello
    }
}
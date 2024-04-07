// Question1:Count how many times lower case vowels occurred in a String entered by the user.

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            System.out.println("The count of vowels is: " + count);
        }
    }
}
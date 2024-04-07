// Question 2 :What will be the output of the following code?

import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    String str="ShradhaDidi";
    String str1="ApnaCollege";
    String str2="ShradhaDidi";
    System.out.println(str.equals(str1) +" "+str.equals(str2));
    }
}

// Output : False True
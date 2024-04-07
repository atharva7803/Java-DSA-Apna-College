// Implementation of String Builder

import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        StringBuilder sb = new StringBuilder(" ");

        for(char ch = 'a'; ch < 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }   
}

// Output: abcdefghijklmnopqrstuvwxy
// TC : O(26)  lenght = 26

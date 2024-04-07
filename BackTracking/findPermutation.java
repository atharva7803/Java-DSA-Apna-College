import java.util.Scanner;
public class findPermutation {

    public static void findPermutation(String str, String ans){    // TC = O(n * n!)
        // base case
        if(str.length() == 0){
            System.err.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);

            // abcde (to remove c) = "ab" + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);   // It will remove ith char
            findPermutation(NewStr, ans+curr);
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        String str = "abc";
        findPermutation(str, " ");
    }
}

// Output:
//  abc
//  acb
//  bac
//  bca
//  cab
//  cba
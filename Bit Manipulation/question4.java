// Question 4 :Convert uppercase characters to lowercase using bits.
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        for(char ch = 'A'; ch <= 'Z' ; ch++){
            System.out.println((char) (ch | ' '));
        }
    }
}

// In simple terms, the expression (char)(ch | ' ') converts an uppercase character to lowercase by setting the fifth bit (counting from the right) to 1. This is achieved by performing the bitwise OR operation between the uppercase character and the space character. The resulting integer value is then cast back to a char to obtain the lowercase character.

// Output:
// a
// b
// c
// d
// e
// f
// g
// h
// i
// j
// k
// l
// m
// n
// o
// p
// q
// r
// s
// t
// u
// v
// w
// x
// y
// z
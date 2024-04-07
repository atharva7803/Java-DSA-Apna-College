import java.util.Scanner;
import java.util.Stack;

public class isduplicateParantheses {

    public static boolean isDuplicateParantheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing bracket
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate parentheses exist
                } else {
                    if (!s.isEmpty()) {
                        s.pop(); // It will pop the opening bracket present at the bottom of the stack
                    }
                }
            } else { // for opening bracket or other characters
                s.push(ch); // push items until closing bracket
            }
        }

        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "((a+b) * a)";
        String str2 = "((a+b))";

        System.out.println(isDuplicateParantheses(str1));
        System.out.println(isDuplicateParantheses(str2));
    }
}

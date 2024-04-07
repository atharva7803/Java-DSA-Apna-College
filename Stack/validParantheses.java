import java.util.Scanner;
import java.util.Stack;
public class validParantheses {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){       // for opening bracket
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')       // ()
                    || (s.peek() == '{' && ch == '}')   // {}
                    || (s.peek() == '[' && ch == ']')   // []
                ){
                    s.pop();                               // if pair found then pop pair
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty(); // r`7eturn true if the stack is empty (all pairs are matched)
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        String str = "({}[]())";
        System.out.println(isValid(str));
        
    }
}
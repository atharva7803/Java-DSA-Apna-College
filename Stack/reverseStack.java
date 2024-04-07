import java.util.Scanner;
import java.util.Stack;
public class reverseStack {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);   
            return;
        }

        int top = s.pop();      
        pushAtBottom(s, data);  
        s.push(top);            
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;         // empty stack is already reversed
        }
        int top = s.pop();      // first remove all elements
        reverseStack(s);        
        pushAtBottom(s, top);   // push the removed elemets at bottom to get reversed stack
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);      // In stack: 5 4 3 2 1

        reverseStack(s);
        printStack(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

// Output: 
// 1
// 2
// 3
// 4
// 5
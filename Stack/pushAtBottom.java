import java.util.Scanner;
import java.util.Stack;
public class pushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);   // after stack becomes empty push 4
            return;
        }

        int top = s.pop();      // move towards top and remove all elements
        pushAtBottom(s, data);  // push 4 at bottom
        s.push(top);            // push all the removed data back to stack
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

// Output: 
// 3
// 2
// 1
// 4
import java.util.Scanner;
import java.util.Stack;
public class nextGreater  {
    public static void main(String[] args) {            // next greater right | TC = O(n)
    Scanner sc = new Scanner(System.in); 
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreater[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){
            // 1. while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // 2. if else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }

            // push elem
            s.push(i);
        }

        for(int i = 0; i < nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

    }
}


// Types of questions
// 1. next greater right
// 2. next greater left
// 3. next smaller right
// 4. next smaller left
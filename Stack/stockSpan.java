import java.util.Scanner;
import java.util.Stack;
public class stockSpan {

    public static void stockSpan(int Stocks[], int Span[]) {
        Stack<Integer> s = new Stack<>();
        Span[0] = 1;
        s.push(0);

        for(int i = 1; i < Stocks.length; i++){
            int currPrice = Stocks[i];
            while (!s.isEmpty() && Stocks[s.peek()] <= currPrice){
                s.pop();
            }
            if(s.isEmpty()){
                Span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                Span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int stocks[] = {100, 80, 60, 70, 60, 85,100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);
        for(int i = 0; i < span.length; i++){
            System.out.println(span[i] + " ");
        }
    }
}

// Output:
// 1 
// 1
// 1
// 2
// 1
// 5
// 7
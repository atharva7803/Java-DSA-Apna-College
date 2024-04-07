import java.util.Scanner;
import java.util.Stack;
public class histogramArea {

    public static void histogramArea(int arr[]) {
        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        // next smaller right
        Stack <Integer> s = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = -1;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();

        for(int i = 0; i <= arr.length-1; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Area: width = j-i-1  (nsr[i] - nsl[i] - 1)
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Max area in histogram: " + maxArea);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int arr[] = {2, 1, 5, 6, 2, 3};     // histogram heights
        histogramArea(arr);
    }
}
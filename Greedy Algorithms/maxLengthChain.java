import java.util.*;
public class maxLengthChain {       // Uses the same approach as activity selection question
    public static void main(String[] args) {        // TC: O(nlogn)
    Scanner sc = new Scanner(System.in); 
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));    // Sort 2nd row which is second no in pairs

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i = 0; i < pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];     //  Updating the end of the current chain
            }
        }

        System.out.println("Max Chain Length is: " + chainLen);
    }
}
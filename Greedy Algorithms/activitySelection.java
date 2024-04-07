import java.util.*;
public class activitySelection {
    public static void main(String[] args) {        // TC: O(n)
    Scanner sc = new Scanner(System.in); 
        
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};         // end time basis sort


        // sorting end (start is given as sorted)
        int activites[][] = new int[start.length][3];

        for(int i = 0; i < start.length; i++){
            activites[i][0] = i;            // store index no
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        // lambda function  to sort 2d array
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));    // here 2 means  to sort end[]


        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        // 1st activivty
        maxAct = 1;
        ans.add(activites[0][0]);

        int lastEnd = activites[0][2];
        for(int i = 1; i < end.length; i++){
            if(activites[i][1] >= lastEnd){            // it means activites are not overlapping
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }

        System.out.println("Max activities are: " + maxAct);
        for(int i = 0; i < ans.size(); i++){
            System.out.println("A" + ans.get(i));
        }
    }
}


// Output:
// Max activities are: 4
// A0
// A1
// A3
// A4
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class jobSequencing {

    static class Job{
        int deadline;
        int profit;
        int id;     // 1(A) 2(B) ...

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        int jobInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobInfo.length; i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // to sort profit in descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time  = 0;
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max Jobs: " + seq.size());

        for(int i = 0; i < seq.size(); i++){
            System.out.println(seq.get(i) + " ");
        }
        System.out.println();

    }       
}
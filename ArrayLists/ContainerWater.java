import java.util.ArrayList;
import java.util.Scanner;
public class ContainerWater {

    // public static int ContainerWater(ArrayList<Integer> height){    // Brute Force  TC - O(n2)
    //     int maxWater = 0;
    //     for(int i = 0; i < height.size(); i++){
    //         for(int j = i + 1; j < height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j - i;
    //             int water = ht * width;
    //             maxWater = Math.max(maxWater, water);
    //         }
    //     }
    //     return maxWater;
    // }

    public static int ContainerWater(ArrayList<Integer> height){    // 2 Pointer Approach TC - O(n)
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {
            // Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int water = ht * width;
            maxWater = Math.max(maxWater, water);

            // update pointer
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("The max water stored is: " +  ContainerWater(height));
    }
}
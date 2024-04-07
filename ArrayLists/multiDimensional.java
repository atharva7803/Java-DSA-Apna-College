import java.util.ArrayList;
import java.util.Scanner;
public class multiDimensional {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);

        for(int i = 0; i < mainList.size(); i++){           // for traversing both the list
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
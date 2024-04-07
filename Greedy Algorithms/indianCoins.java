import java.util.*;
public class indianCoins {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        Integer coins[] = {1,2,10,20,50,100,500,2000};
        
        Arrays.sort(coins, Comparator.reverseOrder()); // Sorting the array in descending order

        int countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -=  coins[i];  
                }
            }
        }

        System.out.println("Total min coins used: " + countOfCoins);


        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
}
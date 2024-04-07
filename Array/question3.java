// Question 3:You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  
// the ith day. Return the maximum profit you can achieve from this transaction. If you cannot achieve 
// any profit, return 0.

// To find the maximum profit while buying and selling stocks.

import java.util.Scanner;
public class question3 {

    public static int buySellStock(int price[]){
        int buyPrice = Integer.MAX_VALUE;  // +infinity
        int maxProfit = 0;

        for(int i = 0; i < price.length; i++){
            if(buyPrice < price[i]){     // price[i] means Selling price (Current price)
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int price[] = new int[n]; 
        System.out.println("Enter the prices of stocks: ");
        for(int i = 0; i < n; i++){
            price[i] = sc.nextInt();
        }
        
        System.out.println("The maximum profit will be: " + buySellStock(price));
    }
}

/*
     Output:
    Enter the size of array: 
    6
    Enter the prices of stocks: 
    7 1 5 3 6 4
    The maximum profit will be: 5 

 */
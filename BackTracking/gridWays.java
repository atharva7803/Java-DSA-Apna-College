// Find no of ways to reach from (0,0) to (n-1,m-1) in n*m grid. Allowed moves are right and down

import java.util.Scanner;
public class gridWays {

    public static int gridWays(int i, int j, int n, int m){    // n = row, m = col
        // Base case
        if(i == n-1 && j == m-1){    // condition for last cell
            return 1;
        }
        else if(i == n || j == m){    // condition for boundary cell
            return 0;
        }

        int way1 = gridWays(i+1, j, n, m);
        int way2 = gridWays(i, j+1, n, m);
        return way1 + way2;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int n = 3, m = 3;
        System.out.println("Total no of ways are: " + gridWays(0, 0, n, m));   // i=0, j=0 means starting from first cell
    }
}
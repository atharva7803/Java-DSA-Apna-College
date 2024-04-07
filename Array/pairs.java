// Implementation of Pairs in Array

import java.util.Scanner;
public class pairs {

    public static void pairs(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j < arr.length; j++){
                System.out.println("Pairs are: ("+ curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        pairs(arr);
    }
}

/*  Output:-
    Enter size of array: 
    5
    Enter 5 elements in array: 
    2 4 6 8 10
    Pairs are: (2,4)
    Pairs are: (2,6)
    Pairs are: (2,8)
    Pairs are: (2,10)

    Pairs are: (4,6)
    Pairs are: (4,8)
    Pairs are: (4,10)

    Pairs are: (6,8)
    Pairs are: (6,10)

    Pairs are: (8,10)
*/
import java.util.Scanner;
public class firstOccu {

    public static int firstOccu(int arr[], int key, int i){
        if(i == arr.length){    //base case
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccu(arr, key, i+1);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int arr[] = {1,5,4,7,8,5,7,6};
        System.out.println("First occurene is at: "+firstOccu(arr, 7, 0));
    }
}

// Output: First occurene is at: 3
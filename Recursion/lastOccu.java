import java.util.Scanner;
public class lastOccu {

    public static int lastOccu(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccu(arr, key, i+1);   // First look forward then compare with self
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound; 
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int arr[] = {1,5,4,7,8,5,7,6};
        System.out.println("Last occurene is at: "+lastOccu(arr, 7, 0));
    }
}

// Output: Last occurene is at: 6                                    
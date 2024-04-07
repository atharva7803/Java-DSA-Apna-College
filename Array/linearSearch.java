// Implementation of Linear Search

import java.util.Scanner;
public class linearSearch {

    public static int linearSearch(int key, int num[]){
        for(int i = 1; i <= num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
        
        int num[] = {5,8,10,2,6};

        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        
        int index = linearSearch(key, num);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: "+ index);
        }
    }
}
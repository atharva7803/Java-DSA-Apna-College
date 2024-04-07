// Question 5 :TOWER OF HANOI(Important!)
// You have 3 towers and N disks of different sizes which can slide on to any tower.The puzzle starts with 
// disks sorted in ascending order of size from top to bottom(i.e.,each disks its on top of an even larger one).
// You have the following constraints:(1) Only one disk can be moved at a time.
// (2) A disk is slid off the top of one tower onto another tower.
// (3)A disk cannot be placed on top of a smaller disk.Write a program to move the disks from the first tower 
//    to thelast using Stacks.

import java.util.Scanner;
public class question5 {

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            // if disk is one then direct transfer from src to destination
            System.out.println("Trasnfer disk "+ n +" from "+ src + " to "+ dest);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);

        // trasfer n disk from src to desti
        System.out.println("Trasnfer disk "+ n +" from "+ src + " to "+ dest);
        
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}

// Output:  ( TC = O(2^n) )
// Trasnfer disk 1 from S to D
// Trasnfer disk 2 from S to H
// Trasnfer disk 1 from D to H
// Trasnfer disk 3 from S to D
// Trasnfer disk 1 from H to S
// Trasnfer disk 2 from H to D
// Trasnfer disk 1 from S to D
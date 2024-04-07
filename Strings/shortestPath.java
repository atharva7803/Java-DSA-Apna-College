// Question: To find Shortest Path

import java.util.Scanner;
public class shortestPath {

    public static float getShortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        System.out.println("The Shortest path is: ");
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        String path;
        System.out.println("Enter the directions in format: N S W E");
        path = sc.nextLine();
        System.out.println(getShortestPath(path));
    }
}
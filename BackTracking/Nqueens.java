import java.util.Scanner;
public class Nqueens {

    public static boolean isSafe(char board[][], int row, int col){
        // To check vertical up in same column
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){      // if Q is placed in above row in same col then return false
                return false;
            }
        }

        // To check diagonally left upwards
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // To check diagonally right upwards
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    static int count = 0;
    public static void Nqueens(char board[][], int row){
        // Base case
        if(row == board.length){
            // printBoard(board);
            count++;   // to print total ways of solution
            return;
        }

        // column loop
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';     // Placing queen Q 
                Nqueens(board, row+1);   // Calling Nqueens and placing them in next row 
                board[row][j] = 'X';     // To remove the placed queen after backtracking     
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("-------Chess Board--------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int n = 4;
        char board[][] = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';       //place X initially
            }
        }

        Nqueens(board, 0);
        System.out.println("Total ways to solve N queens is: " + count);
    }
}
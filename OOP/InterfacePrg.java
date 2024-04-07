import java.util.Scanner;
public class InterfacePrg {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all directionions)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (only  1 step)");
    }
}
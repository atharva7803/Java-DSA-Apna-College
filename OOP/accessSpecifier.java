import java.util.Scanner;
public class accessSpecifier {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        BankAccout myAcc = new BankAccout();
        myAcc.username = "Atharva";
        // myAcc.password = "Atharva";    Here we cannot access password as it is private
        myAcc.setPassword("abcd");
    }
}

class BankAccout{
    public String username;
    private String password;

    public void setPassword(String pw){
        password = pw;
    }
}
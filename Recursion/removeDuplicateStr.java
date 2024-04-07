import java.util.Scanner;
public class removeDuplicateStr {

    public static void removeDuplicateStr(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){     // if its true then currChar is a duplicate value, so call for next index
            removeDuplicateStr(str, idx+1, newStr, map);              
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicateStr(str, idx+1, newStr.append(currChar), map);    // here new char will be append to the newStr
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        String str = "appnnacollege";
        removeDuplicateStr(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

// Output: apncoleg 
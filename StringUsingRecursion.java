import java.util.Scanner;
import java.util.*;
public class StringUsingRecursion {

    static String removeCharacter(String str, int idx, int remove){
        if(idx == str.length()){
            return "";
        }
        
        String smallAns = removeCharacter(str, idx+1,remove);
        
        char currChar = str.charAt(idx);

        if(currChar != remove){
            return currChar + smallAns;
        }
        else{
            return smallAns;
        }

    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any word : ");
        String str = sc.nextLine();

        System.out.println("Enter a character you want to remove from that word :");
        char remove = sc.next().charAt(0);

        System.out.println(removeCharacter(str, 0, remove));
    }
}

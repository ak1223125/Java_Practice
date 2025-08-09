import java.util.*;
public class PalindromeString1 {
    public static void main(String[] args) {
        String str = "abcddcba";
        int i = 0; 
        int j = str.length()-1;
        boolean flag = true;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) {flag = false; break;}
            i++;
            j--;
        }
        if(flag == true) System.out.println("the given string is palindrome string.");
        else System.out.println("the given string is not palindrome string.");
    }
}

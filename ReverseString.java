import java.util.Scanner;

public class ReverseString {

    static String reverseString(String str, int idx){
        if(idx == str.length()){
            return "";
        }
        String smallAns = reverseString(str, idx+1);
        
        return smallAns + str.charAt(idx);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any word : ");
        String str = sc.nextLine();

        System.out.println("Reversed String : ");
        System.out.println(reverseString(str , 0));
    }
}

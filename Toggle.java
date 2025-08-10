import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string for change lower case into upper case :");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 97 && asci <= 122){
                str.setCharAt(i, (char)(asci-32));
            }
            else if(asci <= 90 && asci >= 65){
                str.setCharAt(i, (char)(asci+32));
            }
            else if(asci == 32){
                continue;
            }
            else{
                System.out.println("You are entered wrong character in string.");
                break;
            }
        }
        System.out.println(str);
    }
}

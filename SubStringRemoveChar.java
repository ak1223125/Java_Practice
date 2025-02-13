import java.util.Scanner;

public class SubStringRemoveChar {

    static String removeChar(String str , char remove){

        if(str.length() == 0){
            return "";
        }
        String smallAns = removeChar(str.substring(1), remove);

        char currChar = str.charAt(0);

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

        System.out.println(removeChar(str, remove));
    }
}

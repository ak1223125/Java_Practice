import java.util.Scanner;
public class StringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Word :");
        String word = sc.nextLine();

        System.out.println("Enter second any Word :");
        String word2 = sc.nextLine();

        System.out.println("Is both word equal to each other :");
        if(word.equals(word2)){
            System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

import java.util.Scanner;
public class PatternPrintOfNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter number n : ");
        n = sc.nextInt();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

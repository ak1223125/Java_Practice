import java.util.Scanner;
public class PatternPrintPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter any odd number :");
        n = sc.nextInt();


        for(int p = 1; p <= n/2; p++){    
            for(int s = 1; s <= n/2; s++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 1; k++){
                System.out.println("+");
            }
        }

            for(int t = 1; t <= n; t++) System.out.print("+");

            System.out.println();


        for(int p = 1; p <= n/2; p++){    
            for(int s = 1; s <= n/2; s++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 1; k++){
                System.out.println("+");
            }
        }
    }
}

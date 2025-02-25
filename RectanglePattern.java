import java.util.Scanner;
public class RectanglePattern {
    static void patternPrint(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n :");
        int n = sc.nextInt();

        patternPrint(n);
    }
}

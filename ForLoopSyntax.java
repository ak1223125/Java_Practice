import java.util.Scanner;
public class ForLoopSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for counting :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i+" ");
        }
    }
}

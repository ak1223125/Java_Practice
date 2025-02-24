import java.util.Scanner;
public class PossibleTask {

    static void printStar(int n){
        if(n == 1){
            System.out.println("1");
            return;
        }

        printStar(n-1);

        for(int i = 1; i <= n; i++){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number n :");
        n = sc.nextInt();

        printStar(n);
    }
}

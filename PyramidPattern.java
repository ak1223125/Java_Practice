import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row;
        System.out.println("Enter Row :");
        row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int s = row-i; s >= 1; s--) System.out.print(" ");
            for(int j = 1; j <= 2*i-1; j++) System.out.print("*");
            System.out.println();
        }
        for(int i = 1; i <= row-1; i++){
            for(int s1 = 1; s1 <= i; s1++) System.out.print(" ");
            for(int j = 2*row-2*i-1; j >= 1; j--) System.out.print("*");
            System.out.println();
        }
        

    
    }
}

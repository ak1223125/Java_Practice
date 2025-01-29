import java.util.Scanner;
public class RecursionBasics{

    static void printIncreasing(int n){

        if(n == 1){
            System.out.print("1");
            return;
        }
        printIncreasing(n-1);
        System.out.print(" "+n);
        return;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n numbers : ");
            
            int n = sc.nextInt();
    
            System.out.println("Sum of n number : ");
            
            printIncreasing(n);

    }
}
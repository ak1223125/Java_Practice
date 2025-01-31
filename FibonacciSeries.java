import java.util.Scanner;

public class FibonacciSeries {

    static int fibonacci(int n){

        // base case
        if(n==0||n==1){
            return n;
        }
        //subproblem - recursive work
        int prev1value = fibonacci(n-1);
        int prev2value = fibonacci(n-2);
        
        //self work
        return prev1value + prev2value;
    } 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n's number :");
        int n = sc.nextInt();
        System.out.println("Fibonacci of n is :");

        for(int i = 0; i <= n; i++)
            System.out.print(fibonacci(i)+" ");
    }
}

import java.util.Scanner;

public class SumOfDigitUsingRecursion {

    static int digitSum(int n){

        // base case
        if(n/10==0){
            return n;
        }
        //recursive work
        return   n%10 + digitSum(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to find out total sum digit : ");
        int n = sc.nextInt();

        System.out.println(digitSum(n));
    }
}

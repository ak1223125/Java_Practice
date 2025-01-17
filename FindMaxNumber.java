import java.util.Scanner;
public class FindMaxNumber {

    static int maxNumber(int i,int j){
        if(i>j){
            return i;
        }
        else{
            return j;
        }
    }
    static int minNumber(int i , int j){
        if(i < j){
            return i;
        }
        else{
            return j;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("choose : ");
        System.out.println("1. Maximum.");
        System.out.println("2. minimum.");
        System.out.println("Enter a number of one of them : ");
        int n = sc.nextInt();

        if(n == 1){
            System.out.println("The maximum number is "+maxNumber(a, b));
        }
        if(n == 2){
            System.out.println("The minimum number is "+minNumber(a, b));
        }
        else{
            System.out.println("You are giving wrong input ,Please Try Again!!");
        }
    }
}

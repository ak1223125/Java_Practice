import java.util.Scanner;
// write a program to print all natural numbers from n to 1 using recursion..
public class Recursionq1 {

    static void naturalnumber(int n){

        if(n == 1){ // Base Case
            System.out.print(n);
            return;
        }
        System.out.print(n+" "); // Self work.
        naturalnumber(n-1); // Recursive function.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n's number :");
        int n = sc.nextInt();

        System.out.println("Natural numbers "+n+" to 1 :");
        naturalnumber(n);

    }
}

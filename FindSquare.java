import java.util.Scanner;

public class FindSquare {

    static int square(int p, int q){

        if(q == 0){ // base case
            return 1;
        }
        return p * square(p,q-1);// recursive work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your base number : ");
        int p = sc.nextInt();

        System.out.println("Enter your power number : ");
        int q = sc.nextInt();

        System.out.println("Your Result should be : ");
        System.out.println(square(p, q));
    }
}

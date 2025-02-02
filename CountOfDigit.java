import java.util.Scanner;
public class CountOfDigit {

    static int count(int n){
        if(n/10 == 0){
            return 1;
        }
        return 1 + count(n/=10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n number : ");
        int n = sc.nextInt();

        int count = 0;

        System.out.println("Total Count Digit : ");
        System.out.println(count(n));

    }
}

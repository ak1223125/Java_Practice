import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int p = 1;
    int n;
    System.out.println("Enter a Number to check given number prime or not :");
    n = sc.nextInt();

    for(int i = 2; i < n; i++){
        if(n % i == 0){
            p = 0;
            break;
        }
    }
    if(p == 1) System.out.println(n+" is a prime Number.");
    else System.out.println(n+" is not a prime Number.");
    }
}

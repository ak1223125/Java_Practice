import java.util.Scanner;

public class FindGCD {

    static int greatestCommonDivisor(int a , int b){
        int commonDivisor = 0;

        int i = 0;
        if(a < b)
            i = a;
        else
            i = b;

        for(; i > 0; i--){
            if(a%i == 0 && b%i==0){
                commonDivisor = i;
                break;
            }
        }

        return commonDivisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x number :");
        int x = sc.nextInt();

        System.out.println("Enter y number :");
        int y = sc.nextInt();


        System.out.println("Greatest common divisor of "+x+" and "+y+" is");
        System.out.println(greatestCommonDivisor(x, y));

    }
    
}

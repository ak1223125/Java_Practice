import java.util.Scanner;

public class GCDSecondApproach {

    static int secondApprroach(int x, int y){

        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x number :");
        int x = sc.nextInt();

        System.out.println("Enter y number :");
        int y = sc.nextInt();


        System.out.println("Greatest common divisor of "+x+" and "+y+" is :\n"+secondApprroach(x, y));
    }
}

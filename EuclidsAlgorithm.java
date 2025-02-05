import java.util.Scanner;
public class EuclidsAlgorithm {

    static int algorithm(int x, int y){
        if(y == 0) return x;
        return algorithm(y , x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x number :");
        int x = sc.nextInt();

        System.out.println("Enter y number :");
        int y = sc.nextInt();


        System.out.println("Greatest common divisor of "+x+" and "+y+" is :\n"+algorithm(x,y));        
    }
}

import java.util.*;

public class ReverseNumber {
    static int reverse(int x) {
        long z = 0;
        int y = x;
        for(int i = 1; y != 0; i = 10){
            z *= i;
            z += y % 10;
            y = y / 10; 
        }
        if(z < Integer.MIN_VALUE || z > Integer.MAX_VALUE){
            return 0;
        }
        else{
            return (int)z;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverse(n);
        System.out.println(ans);
    }
}

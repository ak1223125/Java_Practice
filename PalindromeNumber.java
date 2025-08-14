import java.util.Scanner;
public class PalindromeNumber {
    static boolean palindromeNumber(int x){
        boolean flag = true;
        int z = 0;
        int y = x;
        if(y < 0) y = y * -1;
        for(int i = 1; y != 0; i = 10){
            z *= i;
            z += y % 10;
            y = y / 10;
        }
        if(x == z) flag = true;
        else flag = false;

        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = palindromeNumber(n);
        System.out.println(flag);
    }
}

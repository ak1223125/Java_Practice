import java.util.Scanner;
public class SeriesKMultiplication {

    static void seriesMultiple(int num , int k){

        if(k == 0){
            return;
        }
        seriesMultiple(num, k-1);
        System.out.print(num*k+" "); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of Multiple you want : ");
        int num = sc.nextInt();

        System.out.println("Number of multiples times : ");
        int k = sc.nextInt();

        System.out.println("Your multiplication should be :");
        seriesMultiple(num, k);
    }
}

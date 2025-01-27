import java.util.Scanner;

public class TimeAndComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how to find time complexity for loop :");

        // count every initialization, condition and itration in a loop

        // for example :-

        System.out.println("enter a number for count itration : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(n-1 == i){
                System.out.println("Time and complexity of this program : ");
                System.out.println("O"+"("+i+")");
            }
        }

    }
}

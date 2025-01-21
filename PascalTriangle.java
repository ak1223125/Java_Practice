import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Size Array : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j != 0 && j != i){
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                else{
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println("Pascal Triangle : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

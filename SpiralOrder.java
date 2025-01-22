import java.util.Scanner;
public class SpiralOrder {
    static void printMethod(int[][] arr, int r, int c){
        System.out.println("Spiral order of Matrix :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    static void spiralOrderArrangement(int[][] arr, int r, int c){
        int left = 0;
        int right = c-1;
        int top = 0;
        int bottom = r-1;
        
        
        System.out.println("Spiral order of Matrix :");
        for(int i = left; i <= right; i++){
            System.out.print(arr[top][i]+" ");
        }
        top++;
        for(int i = left+1; i <= right; i++){
            System.out.print(arr[i][right]+" ");
        }
        right--;
        for(int i = right; i >= left; i--){
            System.out.print(arr[bottom][i]+" ");
        }
        bottom--;
        for(int i = left; i <= top; i++){
            System.out.print(arr[top][i]+" ");
        }
        left++;



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of 2D array in row * column.");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter "+r*c+" elements in form of maxtrix :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        spiralOrderArrangement(arr, r, c);
    }
}

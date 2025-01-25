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
        int top = 0, left = 0, right = c-1, bottom = r-1;
        int totalelement = 1;
        
        while(left <= right){
            for(int i = left; i <= right && totalelement <= r*c; i++){
                System.out.print(arr[top][i]+" ");
                totalelement++;
            }
            top++;
            for(int i = top; i <= bottom && totalelement <= r*c; i++){
                System.out.print(arr[i][right]+" ");
                totalelement++;
            }
            right--;
            for(int i = right; i >= left && totalelement <= r*c; i--){
                System.out.print(arr[bottom][i]+" ");
                totalelement++;
            }
            bottom--;
            for(int i = bottom; i >= top && totalelement <= r*c; i--){
                System.out.print(arr[i][left]+" ");
                totalelement++;
            }
            left++;
        }
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

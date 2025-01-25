import java.util.Scanner;

public class FillSpiralOrder {
    static void printMethod(int[][] arr, int r, int c){
        System.out.println("Spiral order of Matrix :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void fillElement(int[][] arr, int r , int c){
        int right = c-1, left = 0, top = 0 , bottom = r-1;

        int totalSpace = 1;
        
        while(left <= right){
            for(int i = left; i <= right && totalSpace <= c*r; i++){
                arr[top][i] = totalSpace++;
            }
            top++;
            for(int i = top; i <= bottom && totalSpace <= c*r; i++){
                arr[i][right] = totalSpace++;
            }
            right--;
            for(int i = right; i >= left && totalSpace <= c*r; i--){
                arr[bottom][i] = totalSpace++;
            }
            bottom--;
            for(int i = bottom; i >= top && totalSpace <= c*r; i--){
                arr[i][left] = totalSpace++;
            }
            left++;

        }

        printMethod(arr, r, c);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of 2D array in row * column.");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        fillElement(arr, r, c);

    }
}

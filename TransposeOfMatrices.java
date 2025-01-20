import java.util.Scanner;

public class TransposeOfMatrices {
    static void printMethod(int arr[][],int row , int column){
        System.out.println("Transpose of matrices :");
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Transpose(int[][] arr ,int row, int column){
        int[][] arr2 = new int[column][row];

        for(int i = 0 ; i < column; i++){
            for(int j = 0; j < row; j++){
                arr2[i][j] = arr[j][i];
            }
        }
        printMethod(arr2,column,row);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For Matrices : ");
        System.out.println("Enter row : ");
        int row = sc.nextInt();

        System.out.println("Enter Column : ");
        int column = sc.nextInt();

        System.out.println("Enter array element : ");
        int[][] arr = new int[row][column];

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Transpose(arr,row,column);
    }
}

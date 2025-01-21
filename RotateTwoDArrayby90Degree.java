import java.util.Scanner;

public class RotateTwoDArrayby90Degree {
    static void printMethod(int arr[][],int row , int column){
        System.out.println("Rotate of 2D matrices by 90 degree :");
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void rotateArray90degree(int[][] arr , int row, int column){

        int[][] arr2 = new int[column][row];

        for(int i = 0; i < column; i++){
            for(int j = 0; j < row; j++){
                arr2[i][j] = arr[row-1-j][i];
            }
        }
        printMethod(arr2, row, column);
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
        if(row==column)
            rotateArray90degree(arr, row, column);
        else
            System.out.println("You are giving wrong input..Please Try Again!!!");
    }
}

import java.util.Scanner;

public class MultuplicationOfMatrices {

    static void multipicationOfTwoMatrices(int [][] arr, int [][] arr2, int row, int column,int row1,int column1){

        int[][] multipication = new int[row][column1];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column1; j++){
                for(int k = 0; k < row1; k++){
                    multipication[i][j] += arr[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Multipication of two matrices is : ");
        for(int i = 0; i < multipication.length; i++){
            for(int j = 0; j < multipication[i].length; j++){
                System.out.print(multipication[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For First Matrices : ");
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

        System.out.println("For Second Matrices : ");
        System.out.println("Enter row : ");
        int row1 = sc.nextInt();

        System.out.println("Enter Column : ");
        int column1 = sc.nextInt();

        System.out.println("Enter array element : ");
        int[][] arr2 = new int[row1][column1];

        for(int i = 0 ; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        if(column == row1){
            multipicationOfTwoMatrices(arr, arr2, row, column, row1, column1);
        }
        else{
            System.out.println("You are giving wrong Input . Mulipication is not possible .");
        }

    }
}

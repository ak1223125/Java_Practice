import java.util.Scanner;
public class SumMatrices {
    static void additionOfArray(int [][] arr,int[][] arr2, int row, int column){

        int[][] sum = new int[row][column];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum[i][j] = arr[i][j]+arr2[i][j]; 
            }
        }
        System.out.println("Sum of two Matrices : ");
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++){
                System.out.print(sum[i][j]+" ");
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

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        additionOfArray(arr, arr2 , row,column);

    }
}

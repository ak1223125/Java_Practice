import java.util.Scanner;
public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row : ");
        int row = sc.nextInt();
        System.out.println("Enter column : ");
        int column = sc.nextInt();

        int [][] arr = new int[row][column]; // initilization of 2-D array

        System.out.println("Enter "+row*column+" elements :");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt(); // take user input
            }
        }
        System.out.println("print 2-D array : ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

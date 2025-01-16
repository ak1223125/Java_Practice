import java.util.Scanner;

public class SortArray {

    static void sortZeroAndOne(int [] arr){
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i < zero){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        System.out.println("Sorted array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" array elements('0'/'1') : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sortZeroAndOne(arr);
    }
}

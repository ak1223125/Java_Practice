import java.util.Scanner;

public class InsertionSort {

    static void sort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                if(i >= 2)
                    i = i - 2;
            }
        }

        System.out.println("Sorted Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
    }
}

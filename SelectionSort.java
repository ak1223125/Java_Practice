import java.util.Scanner;

public class SelectionSort{

    static int[] selection_Sort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }

        return arr;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" array elements");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        selection_Sort(arr);

        
        System.out.println("Sorted Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
import java.util.Scanner;

public class InsertionSortAlgorithm {

    static int[] Insertion_Sort(int [] arr){

        for(int i = 1; i < arr.length; i++){
            int j = i;

            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j = j - 1;
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

        Insertion_Sort(arr);

        
        System.out.println("Sorted Array by Insertion sort : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

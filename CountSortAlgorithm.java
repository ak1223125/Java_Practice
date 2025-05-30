import java.util.Scanner;

public class CountSortAlgorithm {
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void countSortAlgo(int [] arr){
        // step 1 -> find largest number in Array.
        int max = findMax(arr);
        // step 2 -> create an array size of [max + 1].
        int[] count = new int[max+1];
        // step 3 -> traverse on count array of array of element i.
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int k = 0;

        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k++] = i;
            }
        }

    }
    static void displayArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the "+n+" elements of Array :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        countSortAlgo(arr);
        System.out.println("Sorted array by count sort algorithm :");
        displayArray(arr);
    }    
}

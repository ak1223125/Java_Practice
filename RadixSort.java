import java.util.Scanner;

public class RadixSort {
    static void printArray(int[] arr){
        System.out.println("Print Array :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static void count_sort(int[] arr,int place){

        int n = arr.length;
        int[] count = new int[10];
        int[] stableArray = new int[n];

        for(int i = 0; i < arr.length; i++){
            count[(arr[i] / place) % 10]++; 
        }

        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }

        for(int i = n-1; i >= 0; i--){
            int idx = count[(arr[i] / place) % 10]-1;
            stableArray[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = stableArray[i];
        }
    }

    static void radix_sort(int [] arr){

        int max = findMax(arr);

        for(int place = 1; (max / place) > 0; place *= 10){
            count_sort(arr, place);
        }
        printArray(arr);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array :");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" Elements of Array :");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        radix_sort(arr);
    }
}

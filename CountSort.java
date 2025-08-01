import java.util.Scanner;
public class CountSort {

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

    static void count_Sort(int[] arr){
        int max = findMax(arr);

        int[] count = new int[max+1];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]] += 1; 
        }
        
        int k =0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k++] = i;
            }
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
        count_Sort(arr);
    }
}

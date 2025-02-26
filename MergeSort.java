import java.util.Scanner;
public class MergeSort {

    static void mergeArray(int[] arr, int l, int mid, int r){
        
        int n1 = mid-l+1;
        int n2 = r-mid; 

        int [] left = new int[n1];
        int [] right = new int[n2];


        for(int i = 0; i < n1; i++){
            left[i] = arr[l+i];
        }
        for(int j = 0; j < n2; j++){
            right[j] = arr[mid+1+j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i < left.length){
            arr[k++] = left[i++];
        }

        while(j < right.length){
            arr[k++] = right[j++];
        }
    }

    static void merge_sort(int[] arr, int l, int r){

        // base case
        if(l >= r) return;
        int mid = (l+r)/2;
        // recursive case
        merge_sort(arr, l, mid);

        merge_sort(arr, mid+1, r);

        mergeArray(arr, l, mid, r);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements of Array :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        merge_sort(arr, 0 , n-1);

        System.out.println("Sorted Array by Merge Sort :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

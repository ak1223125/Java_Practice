import java.util.Scanner;

public class SortedSquare {

    static void reverse(int [] arr){
        int[] arr2 = new int[arr.length];

        arr2 = squareSorted(arr);

        int i = 0; 
        int j = arr2.length-1;
        while(i < j){
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
            i++;
            j--;
        }
        System.out.println("Sorted array : ");
        for(int z = 0; z < arr2.length; z++){
            System.out.print(arr2[z]+" ");
        }
    }


    static int[] squareSorted(int [] arr){
        int i = 0, j = arr.length-1, k = 0;
        int[] arr2 = new int[arr.length];
        
        while(i <= j){
            if(Math.abs(arr[i]) >= Math.abs(arr[j])){
                arr2[k++] = arr[i]*arr[i];
                i++;
            }
            else{
                arr2[k++] = arr[j]*arr[j];
                j--;
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter "+n+" array elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);

    }
}

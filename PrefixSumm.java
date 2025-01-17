import java.util.Scanner;

public class PrefixSumm {

    static void prefixSumRange(int [] arr,int i ,int j){

        int[] arr2 = arr;
        for(int z = i; z < j; z++){
            arr2[z] = arr2[z-1]+arr2[z]; 
        }
        for(int k = 0; k < arr2.length; k++){
            System.out.print(arr2[k] + " ");
        }
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
        System.out.println("Enter Your Range : ");
        int i = sc.nextInt();
        int j = sc.nextInt();

        prefixSumRange(arr, i, j);
        
    }
}

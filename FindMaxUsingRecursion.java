import java.util.Scanner;

public class FindMaxUsingRecursion {
    static int findMax(int[] arr , int idx){

        //Base case -
        if(idx == arr.length-1){
            return arr[idx];
        }
        // recursive work -
        int p =  findMax(arr , idx+1);

        // self work -
        
        if(arr[idx] > p){
            return arr[idx];
        }
        else{
            return p;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();


        int arr[] = new int[n];

        System.out.println("Enter "+n+" Array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The maximum value of array Series is :\n"+findMax(arr, 0));
    }
}

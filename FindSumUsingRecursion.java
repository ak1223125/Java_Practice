import java.util.Scanner;

public class FindSumUsingRecursion {
    static int findSum(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }     
        return arr[idx]+findSum(arr, idx+1);
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

        System.out.println("Total sum of Array series :\n"+findSum(arr, 0));
    }
}

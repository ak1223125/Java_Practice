import java.util.Scanner;

public class SearchIndexUsingRecursion {

    static int findIndex(int [] arr, int idx , int target){

        //base case--
        if(idx == arr.length){
            return -1;
        }

        //self work--
        if(arr[idx] == target) return idx;

        // Recursive case--
        return findIndex(arr, idx+1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n number : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter "+n+" Array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number :");
        int target = sc.nextInt();

        int idx = findIndex(arr, 0, target);

        if(idx != -1){
            System.out.println("Target is present in Array Series . At Index "+idx+".");
        }
        else{
            System.out.println("Target is not present in Array Series . At Index "+ -1);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndicesUsingArrayList {

    static ArrayList<Integer> findAllIndices(int [] arr, int idx, int target){

        if(idx == arr.length)
            return new ArrayList<Integer>();

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr[idx] == target){
            ans.add(idx);
        }

        ArrayList<Integer> smallAns = findAllIndices(arr, idx+1, target);
        ans.addAll(smallAns);

        return ans;
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

        System.out.println("Target Indices series : ");

        ArrayList<Integer> ans = findAllIndices(arr, 0, target);

        for(Integer i : ans){
            System.out.print(i+" ");
        }

    }
}

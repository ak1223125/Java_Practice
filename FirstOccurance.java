import java.util.Scanner;

public class FirstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int [] arr = {2,2,2,5,5,5,5,8,8,8};
        
        System.out.println("Enter the target number that you want to search in given sorted array :");
        int target = sc.nextInt();

        int l = 0;
        int r = arr.length-1;

        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid] == target && r == mid){
                flag = true;
                System.out.println(target+" is found at index "+mid);
                break;
            }
            else if(target >= arr[mid]){
                l = mid+1;
            }
            else if(target <= arr[mid]){
                r = mid-1;
            }
        }
        if(flag == false){
            System.out.println("the given target is not present in array.");
        }        
    }
}

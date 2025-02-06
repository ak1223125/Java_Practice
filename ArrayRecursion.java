import java.util.Scanner;
public class ArrayRecursion {

    static int[] printArray(int[] arr, int idx){

        if(idx == arr.length){
            return arr;
        }
        System.out.print(arr[idx]+" ");

        return printArray(arr, idx+1);
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

        System.out.println("You are Printing your array using recursion : ");
        printArray(arr,0);
    }
}

import java.util.Scanner;

public class Q1UsingBubbleAlgoritm {

    static int[] zeroAtLast(int [] arr){

        for(int i = 0; i < arr.length-1; i++){

            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == 0 && arr[j] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" array elements");
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        zeroAtLast(arr);

        
        System.out.println("Sorted Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}

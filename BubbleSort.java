import java.util.Scanner;
public class BubbleSort {
    static int[] bubbleSort(int [] arr){
        // bubble sort

        // time complexity of bubble sort is O(n^2);
        // space complexity of bubble sort is O(1);
        for(int i = 0; i < arr.length-1; i++){
            boolean flag = false; // optimization in bubble sort

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                   flag = true;
                }
            }
            if(flag == false){
                break;
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

        bubbleSort(arr);

        
        System.out.println("Sorted Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}

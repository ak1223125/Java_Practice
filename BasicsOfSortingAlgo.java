import java.util.Scanner;
public class BasicsOfSortingAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter size of Array :");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements of array :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted array :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

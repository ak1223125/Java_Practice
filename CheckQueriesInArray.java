import java.util.Scanner;

public class CheckQueriesInArray {

    static void checkQueries(int [] arr){
        Scanner sc = new Scanner(System.in);
        int[] freqency = new int[100005];

        for(int i = 0; i < arr.length; i++){
            freqency[arr[i]]++;
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("Check queries in array if it's present in array say 'Yes' otherwise 'No' : ");
            int q = sc.nextInt();
            if(freqency[q] > 0){
                System.out.println("Yes.");
            }
            else{
                System.out.println("No.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size (but size should not be greater than 10^5) : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" array elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        checkQueries(arr);

    }
}

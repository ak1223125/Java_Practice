import java.util.Scanner;
public class FindSubSequencesOfNum{

    static void findSubSequences(int[] arr, int idx, int sum){

        if(idx >= arr.length){
            System.out.print(sum+" ");
            return;
        }

        findSubSequences(arr, idx+1, sum + arr[idx]);
        
        findSubSequences(arr, idx+1, sum);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" array element :");

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();    
        }

        findSubSequences(arr, 0, 0);

    }
}
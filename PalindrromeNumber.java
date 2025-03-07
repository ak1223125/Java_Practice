import java.util.*;
public class PalindrromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array :");
        n = sc.nextInt();

        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        
        System.out.println("Enter any number :");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int ptr = 0;
        for(int i = n-1; i >= 0; i--){
            arr2[ptr++] = arr1[i];
        }

        boolean check = true;
        for(int i = 0; i < n; i++){
            if(arr1[i]==arr2[i]) check = true;
            else {
                check = false;
                break;
            }
        }

        if(check == true) System.out.println("its a palindrome number.");
        else System.out.println("its not a palindrome number.");
        
    }
}

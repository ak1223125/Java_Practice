public class SeperateNegativeAndPositive{

    static void partition(int[] arr){
        int left = 0; 
        int right = arr.length-1;
        while(left < right){
            while(arr[left] < 0) left++;
            while(arr[right] >= 0) right--;
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-13,20,7,0,-4,-13,11,-5,-13};
        partition(arr);
    }
}
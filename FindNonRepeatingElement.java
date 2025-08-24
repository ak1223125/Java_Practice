public class FindNonRepeatingElement {
    public static int findMax(int [] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
    public static int singleNumber(int[] nums) {
        int target = 0;
        int max = findMax(nums);
        int [] arr = new int[max+1];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                target = i;
            }
        }
        return target;
    }
    public static void main(String[] args) {
        int []arr = {2,2,1};
        System.out.println(singleNumber(arr));
    }
}

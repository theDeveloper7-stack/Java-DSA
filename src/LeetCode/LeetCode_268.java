package LeetCode;
//Missing Number
public class LeetCode_268 {
    // using the math formula 1+2+3+......+n = [n * (n+1)]/ 2
    public static int missingNumber(int[] nums) {
        int actualSum = (nums.length * (nums.length + 1) ) / 2;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
        }
        int ans = actualSum - currentSum;
        return ans;
        }

    public static int missingNumberByCyclicSort(int[] nums) {
        // using cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swapArray(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void main() {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumberByCyclicSort(arr));
    }
}

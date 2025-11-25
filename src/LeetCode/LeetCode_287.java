package LeetCode;

import java.util.Arrays;

// Find the duplicate number
public class LeetCode_287 {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i] != i + 1){
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex] ){
                    swapArray(nums,i,correctIndex);
                }
                else{
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main() {
        int[] arr = {1,3,4,2,2};
        int[] arr2 = {3,3,3,3,3};
        int ans = findDuplicate(arr2);
        System.out.println(ans);
    }
}

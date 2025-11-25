package LeetCode;

import java.util.Arrays;

//Set Mismatch
public class LeetCode_645 {
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swapArray(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                return new int[]{nums[j], j + 1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main() {
        int[] arr = {1,2,2,4};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(findErrorNums(arr2)));
    }
}

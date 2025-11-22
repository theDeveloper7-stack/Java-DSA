package LeetCode;

import java.util.ArrayList;
import java.util.List;

// Find All Numbers Disappeared in an Array
public class LeetCode_448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        /*
        If range = [0,n]
        then every element at index = value;

        If range = [1,n]
        then every element at index= value - 1;
         */
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swapArray(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans;
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main() {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}

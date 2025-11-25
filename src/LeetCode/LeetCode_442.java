package LeetCode;
import java.util.ArrayList;
//Find All Duplicates in an Array
public class LeetCode_442 {

    public static ArrayList<Integer> findAllDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swapArray(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                ans.add(nums[j]);
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
        int arr2[] = {1,1,2};
        System.out.println(findAllDuplicates(arr));
    }
}

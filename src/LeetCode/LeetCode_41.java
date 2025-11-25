package LeetCode;
// First Missing Positive
public class LeetCode_41 {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swapArray(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main() {
        int[] arr = {7,8,9,11,12};
        int[] arr2 = {3,4,-1,1};
        int[] arr3 = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
}



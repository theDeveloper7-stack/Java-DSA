package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

// Find First and Last Position of Element in Sorted Array
public class LeetCode_34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int first = binarySearch(nums,target,true);
        int last =  binarySearch(nums,target,false);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }

    public static int binarySearch(int[] arr, int target,boolean isLeft){
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // integer has a fixed size
            // if there is a large value foe start and end then it exceeds the range
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                index = mid;
                if(isLeft == true){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            // If the array is in descending order then the condition statement will be reversed.
        }
        return index;
    }

    public static void main(String[] args) {
        int[] test = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(test, 8)));
    }
}

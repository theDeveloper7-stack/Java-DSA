public class MaxMinInArray {
    /*
    create 2 methods that will find max and min element in an array
     */

    public static int maxInArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static int minInArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int max = maxInArray(arr);
        int min = minInArray(arr);
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }
}

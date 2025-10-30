package LeetCode;
// Find Numbers with Even Number of Digits
public class LeetCode_1295 {
    public static int count(int n) {
        int ct = 0;
//        int rem = 0;
        while(n>0){
//            rem = n%10;
            n = n /  10;
            ct++;
        }
        return ct;
    }
    public static int evenDigits(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771,67,12};
        System.out.println(evenDigits(nums));
    }
}

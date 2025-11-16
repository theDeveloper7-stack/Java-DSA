package LeetCode;
// Peak Index in a Mountain Array (Bitonic array)
// A mountain array is an array in which the numbers are 1st increasing the decreasing.
public class LeetCode_852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int  mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}

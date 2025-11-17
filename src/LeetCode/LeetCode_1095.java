package LeetCode;
// Find in Mountain Array
public class LeetCode_1095 {
    public static int orderedBinarySearch(int[] arr, int target,int start, int end){
        if(arr[start] < arr[end]){
            // if the array is ascending
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        else {
            // if the array is descending
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(target < arr[mid]){
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
    public static int findInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] mountainArray = {1, 2, 3, 4, 5, 3, 1};
        int peakIndex = findInMountainArray(mountainArray);
        int firstTry = orderedBinarySearch(mountainArray, 3, 0, peakIndex);
        if (firstTry != -1) {
            System.out.println(firstTry);
        } else {
            int secondTry = orderedBinarySearch(mountainArray, 3, peakIndex, mountainArray.length - 1);
            System.out.println(secondTry);
        }
    }
}

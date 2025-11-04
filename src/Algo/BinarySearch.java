package Algo;

public class BinarySearch {
    // This algorithm is only applicable for sorted arrays.
    /*
    1. Find the middle element of the array
    2. Checking whether the target element is greater than or smaller than the middle element
    3. If the middle element == target found answer
    4. All this is iterating till start point exceeds end point(element not found)

    With each iteration the search space is getting half
    */

    public static int binarySearch(int[] arr, int target){
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
                return mid;
            }
            // If the array is in descending order then the condition statement will be reversed.
        }
        return -1;
    }
    //.........................................................................
    public static int orderedBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
    //......................................................................
    // Celling of a number
    /*
        find the smallest number in the array that is
        greater than or equal to the target number (celling num >= target)
     */
    public static int cellingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if( target > arr[mid]){
                start  = mid + 1;
            }
            else{
                return mid;
            }
        }
        if(start > arr.length - 1){
            return -1;
        }
        // if the target element is greater than the last element in the array
        return start;
    }

    // Floor of a number
    /*
        find the greatest number in the array that is
        smaller than or equal to the target number (celling num <= target)
     */

    public static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if( target > arr[mid]){
                start  = mid + 1;
            }
            else{
                return mid;
            }
        }
        if(end < 0){
            return -1;
        }
        // if the target element is the smaller than the 1st element in the array
        return end;
    }

    //......................................................................

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] descArray = {90,80,50,40,20,10};
        int index = binarySearch(sortedArray, 40);
        System.out.println("The target element is at index: " + index);
        int index2 = orderedBinarySearch(descArray,90);
        System.out.println("The target element is at index: " + index2);
        int cellingIndex = cellingNumber(sortedArray, 55);
        System.out.println("The celling number is at index: " + cellingIndex);
        int floorIndex = floorNumber(sortedArray, 55);
        System.out.println("The floor number is at index: " + floorIndex);
    }
}

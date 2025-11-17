package LeetCode;
// Search in Rotated Sorted Array
// arr = {2,4,5,7,8,9,10,12}
// after 1st rotation ---> {12,2,4,5,7,8,9,10}
// after 2nd rotation ---> {10,12,2,4,5,7,8,9}
/*
1st -- find the pivot element that is at what point the array is changed that is 12
(the left part of a pivot element and as well as the right part, both are in ascending order)

[how to find pivot???
the only part that is 12,2 is descending
--> arr[mid] > arr[mid + 1]
--> arr[mid] < arr[mid - 1]
--> if start element > middle element
(the elements after the middle element will be smaller than the 1st element, end = mid - 1)
--> if start element < middle element
(start = mid + 1)
]

2nd -- apply binary search on both sides
 */
public class LeetCode_33 {
    public static int binarySearch(int[] arr, int target,int start,int end){
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
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if( (mid < end) && (arr[mid] > arr[mid + 1]) ){
                return mid;
            } else if ((mid > start) && (arr[mid] < arr[mid - 1]) ) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int pivotBinarySearch(int[] arr,int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length - 1);
        }
        else if(arr[pivot] == target){
            return pivot;
        }
        else if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot - 1);
        }
        else if(target <= arr[0]){
            return binarySearch(arr,target,pivot + 1, arr.length - 1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr2 = {3,5,1};
        int index = pivotBinarySearch(arr2,3);
        System.out.println(index);
    }
}

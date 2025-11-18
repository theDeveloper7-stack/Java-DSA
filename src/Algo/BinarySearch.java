package Algo;

import java.util.Arrays;

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
    public static int binarySearchInRange(int[] arr, int target, int start, int end){
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
    //......................................................................
    // find an element in an infinite sorted array
    public static int searchInInfiniteArray(int[] arr, int target){
        // here the problem is we can not use the array.length, because we are assuming it's an infinite array.
        // In this case we have to search from small chunks.(the chunk should be increased by doubling the size)
        // Apply binary search in every chunk.
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            // This is the condition for the target to lay int the range.
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            // doubling the end index at every iteration.
            start = newStart;
        }
        return binarySearchInRange(arr,target,start,end);
    }
    //......................................................................
    /*
    Let the matrix is sorted that is in both row and column manner

    10 20 30 40
    11 24 35 45
    28 29 37 49
    33 34 38 50

    In matrix for a binary search we should focus on eliminating row and columns.

    if the element is greater than the target then eliminate column.
    if the element is less than the target then eliminate the row.
     */

    public static int[] binarySearchInMatrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;
        while ( (row < matrix.length) && (col >= 0) ){
            if (matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
    //......................................................................

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] descArray = {90,80,50,40,20,10};
        int[] longArray = {10,30,50,70,80,100,400,600,700,1000,30000,700000};

        int[][] mat1 = {{10,20,30,40},{11,24,35,45},{28,29,37,49},{33,34,38,50}};
        int[][] mat2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


        int index = binarySearch(sortedArray, 40);
        System.out.println("The target element is at index: " + index);
        int index2 = orderedBinarySearch(descArray,90);
        System.out.println("The target element is at index: " + index2);
        int cellingIndex = cellingNumber(sortedArray, 55);
        System.out.println("The celling number is at index: " + cellingIndex);
        int floorIndex = floorNumber(sortedArray, 55);
        System.out.println("The floor number is at index: " + floorIndex);
        int index3 = searchInInfiniteArray(longArray, 70);
        System.out.println("The target element is at index: " + index3);

        System.out.println(Arrays.toString(binarySearchInMatrix(mat1,37)));
    }
}

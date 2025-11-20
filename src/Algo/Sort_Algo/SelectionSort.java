package Algo.Sort_Algo;

import java.util.Arrays;

public class SelectionSort {
    /* In this algo we have to find either maximum or minimum
    element in the array and place it at its correct index.
     */
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            //(when the i = 0, lastIndex = 4)
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swapArray(arr,maxIndex,lastIndex);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args){
        int[] arr = {4,5,1,2,3};
        int[] arr2 = {4,4,5,5,5,1,1,2,2,3};
        int[] arr3 = {};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}

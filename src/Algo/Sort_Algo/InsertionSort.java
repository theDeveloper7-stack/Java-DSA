package Algo.Sort_Algo;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swapArray(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        int[] arr2 = {4,4,5,5,5,1,1,2,2,3};
        int[] arr3 = {};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package Algo.Sort_Algo;

import java.util.Arrays;

public class CycleSort {
    // When there is numbers like 1,2,3,.....n but unsorted then use cycle sort.
    // let if the array is sorted then all the numbers at the (index = current number - 1).
    public static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swapArray(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    public static void swapArray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main() {
        int[] arr = {4,5,1,2,3};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

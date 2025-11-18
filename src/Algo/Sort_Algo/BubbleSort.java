package Algo.Sort_Algo;

import java.util.Arrays;

/*
In this algo we will check adjacent elements that is

at every iteration we will check the element is smaller than the next element or not
if yes then keep as it is if not swap it.

with 1st pass the largest element will be placed at the end of the array.
with 2nd pass the 2nd largest element will be placed at 2nd last place.
and so on....


 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if previous element is greater than the next element
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,8,3,0};
        // int[] arr2 = {1,2,3,4,5,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

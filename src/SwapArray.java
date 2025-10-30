import java.util.Arrays;

public class SwapArray {
    /*
    create a method that should swap the values of two indices
     */

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before swap: " + Arrays.toString(arr));
        swap(arr, 0, arr.length - 1);
        System.out.println("After swap" + Arrays.toString(arr));
    }
}

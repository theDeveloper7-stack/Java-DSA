package Algo;

public class LinearSearch {
    // create a method to search an element or that is present in the array or not
    public static int linearSearch(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            // the loop goes through the array starting from index 0
            if(arr[i] == element){
                /*
                checks the condition at every loop whether the current element
                is equal to the given element if found then returns it index
                 */
                System.out.println(arr[i] + " is present in array at index : " + i);
            }
        }
        return -1;
        // otherwise returns -1
    }
    //.....................................................................
    public static void searchInString(String str, char target){
        for(int i = 0; i < str.length(); i++){
            // length() this method is from String class which returns length of string
            if(str.charAt(i) == target){
                System.out.println(str.charAt(i) + " is present in array at index : " + i);
                // charAt() this also from String class which returns the index of the character of the String
            }
        }
    }
    //.....................................................................
    public static void searchInRange(int[] arr, int target,int start,int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                System.out.println(arr[i] + " is present in array at index : " + i);
            }
        }
    }
    //.....................................................................
    public static void findMinInArray(int[] arr){
        int min = Integer.MAX_VALUE;
        // initially it assigns the max value to min
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                // checks at every iteration whether the current value is less than min or not
                // if yes then assign it to min
                min = arr[i];
            }
        }
        System.out.println("The minimum number is " + min + " is present at index : " + i);
    }
    //.....................................................................
    public static void findMaxInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int i ;
        // Initially it takes the min value
        for (i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                // checks at every iteration whether the current value is greater than max or not
                // if yes then assign it to max
                max = arr[i];
            }
        }
        System.out.println("The maximum number is " + max + " is present at index : " + i);
    }
    //.....................................................................
    public static void searchIn2DArray(int[][] arr,int element){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == element){
                    System.out.println(arr[i][j] + " is present in array at index : " + i +" "+j);
                }
            }
        }
    }
    //.....................................................................
    public static void findMinIn2DArray(int[][] arr){
        int min = Integer.MAX_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(min + " is present in array at index : " + row +" "+col);
    }
    //.....................................................................
    public static void findMaxIn2DArray(int[][] arr){
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max + " is present in array at index : " + row +" "+col);
    }
    //.....................................................................
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        linearSearch(arr,5);
        String str = "Roshan";
        searchInString(str,'o');
        int[] arr2 = {1,2,3,4,5,-1,-40,8,0};
        searchInRange(arr2,-1,4,6);
        findMinInArray(arr2);
        findMaxInArray(arr2);
        int[][] arr3 = {{1,2},{3,4},{5,6}};
        searchIn2DArray(arr3,5);
        findMinIn2DArray(arr3);
        findMaxIn2DArray(arr3);
    }
}

// The 2D array
/*
    0  1
__|__________
0 |  1  2
1 |  2  3
2 |  3  4
*/
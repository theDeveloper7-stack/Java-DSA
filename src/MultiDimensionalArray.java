import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // [rows][columns]
        // rows are mandatory.

        // int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(Arrays.deepToString(arr2));
        int arr3[][] = new int[3][3];
        // input
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }

        // printing
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

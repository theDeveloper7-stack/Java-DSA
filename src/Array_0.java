import java.util.Arrays;
import java.util.Scanner;

public class Array_0 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        // DataType[] var_name = new dataType[size];

        // int[] roll = new int[5];
        // int[] roll2 = {1,4,5,3,5};
        // All element should be same datatype and in continuous manner

        int[] roll; // this is the declaration of array, roll is getting defined in the stack
        roll = new int[5]; // actually here the object is being created in the memory(heap)

        // System.out.println(roll[0]);
        // [0,0,0,0,0]
        // by default the value in the integer array will be 0s
        // for String it's null

        // input using for loop
        for (int i = 0; i < roll.length; i++) {
            roll[i] = sc.nextInt();
        }

        // printing the elements
        for (int i = 0; i < roll.length; i++) {
            System.out.print(roll[i] + " ");
        }

        // printing using for each loop
        // for(int num : roll){
            // System.out.println(num + " ");
        // }

        // printing using Array class
        // System.out.println(Arrays.toString(arr));

        // System.out.println(roll[5]);
        // ArrayIndexOutOfBounds exception

        //..................................................
        String str[] = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}

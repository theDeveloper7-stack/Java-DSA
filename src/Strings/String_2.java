package Strings;

import java.util.Arrays;

public class String_2 {
    public static void main(String[] args) {
        System.out.println(56);
        // calls the Integer.toString() method
        System.out.println("roshan");
        System.out.println(Arrays.toString(new int[] {1,2,3,4}));
        /*
        the parameter is an object type, it will print some random values.
        it prints hashcode.
        that's why we use Arrays.toString()
        */
        float dec = 453.1234f;
        System.out.printf("formated number is %.2f", dec);
        // this is formated printing %.2f (placeholder) will print only 2 digits after the decimal.
        System.out.println(); // for next line
        System.out.printf("pi : %.3f", Math.PI);
    }
}

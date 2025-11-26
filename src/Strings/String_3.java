package Strings;

import java.util.ArrayList;

public class String_3 {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        // adds the ascii values
        System.out.println("a" + "b");
        // normal concatenation
        System.out.println('a' + 3);
        // gives the ascii value by adding 3
        System.out.println((char)('a' + 3));
        // gives the character value by adding 3 that is 'd'.
        System.out.println("a" + 1);
        // It will give a1
        // integer will be converted to Integer (Wrapper class) that will call toString() method
        System.out.println("Roshan" + new ArrayList<>());
        // here it also calls toString() method.
    }
}

package Strings;

import java.util.Arrays;

public class String_5 {
    public static void main(String[] args) {
        String name = "Roshan Kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        // converts into character array.
        // [R, o, s, h, a, n,  , K, u, m, a, r]

        System.out.println(name.toUpperCase());
        // original object does not change.

        System.out.println(name.indexOf('K'));
        // gives the index of the character.

        System.out.println("    roshan    ".strip());
        // extra spaces at first and end are removed.

        System.out.println(Arrays.toString(name.split(" ")));
        // splits at the space
    }
}

package Patterns;
/*
    Steps to solve any pattern questions........
        1. Run the outer for loops the no. of lines (no. of rows) of the pattern.
        2. Identify for every no. of rows how many columns are there & type of elements.
        3. What do you need to print --> ..................
 */
public class PatternQuesitons {
    public static void pattern_1(int n){
        /*
        Pattern 1
        *****
        *****
        *****
        *****
        *****
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //................................................................................
    public static void pattern_2(int n){
        /*
        The Pattern 2
        *
        * *
        * * *
        * * * *
         */
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }
    //...........................................................................
    public static void pattern_3(int n){
        /*
        The Pattern 3
        *****
        ****
        ***
        **
        *
         */
        for (int row = 1; row <= n ; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //...............................................................................
    public static void pattern_4(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    //...............................................................................

    public static void main(String[] args) {
        System.out.println("Pattern 1 : ");
        pattern_1(5);
        System.out.println(".............................................");
        System.out.println("Pattern 2 : ");
        pattern_2(4);
        System.out.println(".............................................");
        pattern_3(5);
        System.out.println(".............................................");
        pattern_4(5);
        System.out.println(".............................................");
    }
}

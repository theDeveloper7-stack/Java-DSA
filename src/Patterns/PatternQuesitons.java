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
    public static void pattern_5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //...............................................................................
    public static void pattern_6(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;

            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //...............................................................................
    public static void pattern_7(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    //...............................................................................
    public static void pattern_8(int n){
        /*
        4 4 4 4 4
        4 3 3 3 4
        4 3 2 3 4
        4 3 3 3 4
        4 4 4 4 4
         */
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <=n ; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex+ " ");
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
        System.out.println("Pattern 3 : ");
        pattern_3(5);
        System.out.println(".............................................");
        System.out.println("Pattern 4 : ");
        pattern_4(5);
        System.out.println(".............................................");
        System.out.println("Pattern 5 : ");
        pattern_5(5);
        System.out.println(".............................................");
        System.out.println("Pattern 6 : ");
        pattern_6(5);
        System.out.println(".............................................");
        System.out.println("Pattern 7 : ");
        pattern_7(5);
        System.out.println(".............................................");
        System.out.println("Pattern 8 : ");
        pattern_8(2);
        System.out.println(".............................................");
    }
}

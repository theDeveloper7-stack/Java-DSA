package Recursion;

public class Recursion_1 {
    // write a method that takes a number and prints it.
    // print first 5 numbers : 1,2,3,4,5
    public static void printNum(int n){
        if (n == 6){
            return;
        }
        // the base condition to stop it from keep on repeating.
        // with no base condition the stack is getting full by recursive calls.
        // and at the end it will show the stackOverFlow error.
        System.out.println(n);
        printNum(n + 1);
    }
//    public static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    public static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//    public static void print4(int n){
//        System.out.println(n);
//        print5(5);
//    }
//    public static void print5(int n){
//        System.out.println(n);
//    }
    //..............................................................
    // Instead of calling again and again call the function itself (Recursion)
    public static void main(String[] args) {
        // while the function is not finished executing it will remain in the stack.
        printNum(1);
    }
}

package Recursion;

public class Recursion_2 {
    // Find nth fibonacci number
    // 0,1,1,2,3,5.............
    public static int fibonacciByRecursion(int n){
        if (n <= 1){
            return n;
        }
        return fibonacciByRecursion(n-1) + fibonacciByRecursion(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacciByRecursion(6));
    }
}

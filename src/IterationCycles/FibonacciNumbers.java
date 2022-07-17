package IterationCycles;

/*

 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        f(9);
    }

    private static int f(int i) {
        System.out.print(" " + i);
        if(i == 0) return 0;
        else if(i == 1) return 1;
        else return f(i - 2) + f(i - 1);
    }
}

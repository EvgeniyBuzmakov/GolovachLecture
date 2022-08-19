package IterationCycles;

import java.util.Arrays;

/*

 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        //fibNaive(5);
        System.out.println(Arrays.toString(fibEffective(11)));
    }

    private static int fibNaive(int i) {
        System.out.print(" " + i);
        if(i == 0) return 0;
        else if(i == 1) return 1;
        else return fibNaive(i - 2) + fibNaive(i - 1);
    }

    private static long[] fibEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n ; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}

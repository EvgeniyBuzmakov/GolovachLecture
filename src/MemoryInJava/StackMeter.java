package MemoryInJava;

/*

 */
public class StackMeter {
    static int counter0 = 0;
    static int counter10 = 0;

    public static void main(String[] args) {
        try {
            test0();
        } catch (StackOverflowError ignore) {/*NOP*/}
        System.out.println(counter0);

        try {
            test10();
        } catch (StackOverflowError ignore) {/*NOP*/}
        System.out.println(counter10);

    }

    private static void test0() {
        counter0++;
        test0();
    }

    private static void test10() {
        long L0 = 0;
        long L1 = 0;
        long L2 = 0;
        long L3 = 0;
        long L4 = 0;
        long L5 = 0;
        long L6 = 0;
        long L7 = 0;
        long L8 = 0;
        long L9 = 0;
        counter10++;
        test10();
    }
}

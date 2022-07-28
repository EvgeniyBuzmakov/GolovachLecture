package MemoryInJava;

/*

 */
public class StackOverflowError_OutOfMemoryError {

    public static void main(String[] args) {
        f(null);
    }

    private static void f(Object arg) {

        byte[] data = new byte [1024];
        Object[] newArg = {arg, data};
        f(newArg);
    }
}

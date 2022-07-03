package MemoryInJava;

/*

 */
public class OutOfMemoryError {

    public static void main(String[] args) {
        //Object ref100 = new long[Integer.MAX_VALUE];

        Object ref = new long[Integer.MAX_VALUE / 100];
        Object ref2 = new long[Integer.MAX_VALUE / 100];
        Object ref3 = new long[Integer.MAX_VALUE / 100];
        Object ref4 = new long[Integer.MAX_VALUE / 100];
        Object ref5 = new long[Integer.MAX_VALUE / 10];
        Object ref6 = new long[Integer.MAX_VALUE / 10];
        Object ref7 = new long[Integer.MAX_VALUE / 10];
        Object ref8 = new long[Integer.MAX_VALUE / 10];
        Object ref9 = new long[Integer.MAX_VALUE / 10];
        Object ref10 = new long[Integer.MAX_VALUE / 10];
        Object ref11 = new long[Integer.MAX_VALUE / 10];
    }

}

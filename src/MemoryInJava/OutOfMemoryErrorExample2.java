package MemoryInJava;

/*
специальным флагом:
-verbose:gc
вызываем GC в консоль
 */
public class OutOfMemoryErrorExample2 {

    public static void main(String[] args) {

        Object[] ref = new Object[1];
        int counter = 0;

        while (true) {
            ref = new Object[] {ref, new byte[1_000]};
            System.out.println(counter++);
        }
    }
}
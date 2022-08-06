package MemoryInJava;

/*

 */
public class OutOfMemoryErrorExample6 {

    public static void main(String[] args) {
        Object[] ref = new Object[1];

        while (true) {
            ref[0] = new Object[] {ref, new byte[650_000_000]};
            ref = (Object[]) ref[0];
        }
    }
}
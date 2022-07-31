package MemoryInJava;

/*

 */
public class OutOfMemoryErrorExample4 {

    public static void main(String[] args) {
        Object ref = null;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(i);
            ref = new Object[] {ref, new byte[1_000_000]};
        }
    }
}

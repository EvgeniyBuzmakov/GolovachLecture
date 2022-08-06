package MemoryInJava;

/*

 */
public class StackOverflowErrorAndOutOfMemoryError {

    public static void main(String[] args) {

        byte[] ref = new byte[10_000_000];  //OutOfMemoryError
      //  byte[] ref1 = new byte[1_000];      //StackOverflowError

        main(args);
    }
}

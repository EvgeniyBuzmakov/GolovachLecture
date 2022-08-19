package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/*

 */
public class ReadFullyByByte {

    public static void main(String[] args) throws IOException {

        InputStream file = new FileInputStream("data/input4.txt");
        readFullyByByte(file);
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int fog = in.read();
            if(fog > 0) {
                System.out.print((char) fog);
            }
            else {
                System.out.println();
                System.out.print("***************************************************");
                System.out.println("\n" + "end");
                break;
            }
        }

    }
}

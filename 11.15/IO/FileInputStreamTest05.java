package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream f1= null;
        try {
            f1 = new FileInputStream("IO/text2.txt");

            byte[] b1 = new byte[f1.available()];
            int readCount = f1.read(b1);
            System.out.println(new String(b1,0,readCount));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (f1 != null) {
                try {
                    f1.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

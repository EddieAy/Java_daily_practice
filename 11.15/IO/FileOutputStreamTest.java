package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream f1= null;
        try {
            f1 = new FileOutputStream("IO/myWrite.txt",true);
            byte[] b1 = {10,66,97,98,99,100};
            f1.write(b1);

            f1.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
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

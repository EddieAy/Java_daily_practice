package Copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("Copy/in.txt");
            fos = new FileOutputStream("F:\\zera\\jpro\\11.16\\123.txt",true);

            byte[] b1 = new byte[100 * 1024];
            int readCount = 0;
            while ((readCount = fis.read(b1)) != -1){
                fos.write(b1,0,readCount);
            }


            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null){
                fos.close();
            }
        }
    }
}

package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream f1= null;
        try {
            f1 = new FileInputStream("IO/text2.txt");
            int readCount = 0;
            byte[] b1 = new byte[8];
            while ((readCount = f1.read(b1)) != -1){
                System.out.print(new String(b1,0,readCount));
            }
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

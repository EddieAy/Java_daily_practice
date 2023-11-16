package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream f1= null;
        try {
            f1 = new FileInputStream("F:\\zera\\jpro\\11.15\\IO\\text.txt");

            int readData = 0;
            /*while ((readData = f1.read()) != -1){
                System.out.println((char) readData);
            }*/
            while (f1.read()!= -1){
                readData = f1.read();
                System.out.println((char) readData);
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

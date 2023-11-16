package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

        FileInputStream f1 = null;
        try {
             f1 = new FileInputStream("F:\\zera\\jpro\\11.15\\IO\\text.txt");

            System.out.println(f1.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (f1 != null) {
                try {
                    f1.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}

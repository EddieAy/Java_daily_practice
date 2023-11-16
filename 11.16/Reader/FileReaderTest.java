package Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\zera\\jpro\\11.16\\123.txt");
            int readCount;
            char[] c1 = new char[4];
            while ((readCount = fr.read(c1)) != -1){
                System.out.print(new String(c1,0,readCount));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

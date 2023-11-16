package Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("F:\\zera\\jpro\\11.16\\123.txt",true);
            String s1 = "\n\n你爱我 我爱你 甜蜜蜜\n";
            fw.write(s1);
            fw.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

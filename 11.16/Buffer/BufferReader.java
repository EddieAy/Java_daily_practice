package Buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader("F:\\zera\\jpro\\11.16\\Buffer\\buffer");
//            BufferReader br = new BufferReader(fr);
            br = new BufferedReader(fr);

            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

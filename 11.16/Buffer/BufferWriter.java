package Buffer;

import java.io.*;

public class BufferWriter {
    public static void main(String[] args) {
        try {
//            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\zera\\jpro\\11.16\\124.txt")));
            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\zera\\jpro\\11.16\\124.txt",true)));

            br.write("2222123");
            br.write("qweqwe");
            br.write("qweqwe");

            br.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

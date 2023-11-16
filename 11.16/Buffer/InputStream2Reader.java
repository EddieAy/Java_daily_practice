package Buffer;

import java.io.*;

public class InputStream2Reader {
    public static void main(String[] args){
        FileInputStream fis;
        try {
            fis = new FileInputStream("F:\\zera\\jpro\\11.16\\123.txt");
            InputStreamReader FileReader = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(FileReader);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

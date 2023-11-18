package DataStreamTest;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test02 {
    public static void main(String[] args) throws Exception{
        DataInputStream d1 = new DataInputStream(new FileInputStream("data"));

        System.out.println(d1.readByte());
        System.out.println(d1.readInt());
        System.out.println(d1.readBoolean());

        d1.close();
    }
}

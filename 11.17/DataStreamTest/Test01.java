package DataStreamTest;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test01 {
    public static void main(String[] args) throws Exception{
        DataOutputStream d1 = new DataOutputStream(new FileOutputStream("data",true));

        d1.writeBytes("qwer");
        d1.write(32);
        d1.writeBoolean(true);

        d1.flush();
    }
}

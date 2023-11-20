package ObjectStreamTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test02_loadObject {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));

        Object o1 = ois.readObject();
        System.out.println(o1);
        ois.close();
    }
}

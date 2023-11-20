package ObjectStreamTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test01 {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student"));


        oos.writeObject(new Student("Jack",368452));

        oos.flush();
        oos.close();
    }
}

package ObjectStreamTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.List;

public class Test04_load03 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multi_students"));
        Object obj = ois.readObject();

        System.out.println(obj instanceof HashMap<?,?>);
//        System.out.println(obj instanceof List<String>);

        if (obj instanceof List<?>){
            List<Student> l1 = (List<Student>) obj;
            for (Student s:l1){
                System.out.println(s);
            }
        }

//        System.out.println(obj);

        ois.close();
    }
}

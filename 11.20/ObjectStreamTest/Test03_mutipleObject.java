package ObjectStreamTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test03_mutipleObject {
    public static void main(String[] args) throws Exception{
        List<Student> l1 = new ArrayList<>();
        l1.add(new Student("Tomson",123));
        l1.add(new Student("Jack",312));
        l1.add(new Student("GC",124));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multi_students"));
        oos.writeObject(l1);

        oos.flush();
        oos.close();
    }

}

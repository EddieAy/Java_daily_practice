package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsTest {
    public static void main(String[] args) {
        //接口无法new 对象
        Collection c = new ArrayList();
        c.add(1300);
        c.add("qwe");
        c.add(3.14);
        c.add(new Student());

        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());
        c.add("hello");
        System.out.println(c.size());
        c.add(true);
        c.add(false);
        System.out.println("Does it contains?" + c.contains(new Student() == new Student()));

        c.remove(true);
        c.remove(false);
        System.out.println(c.contains("qwee"));
        System.out.println("---------------------------------------");
        System.out.println(c.remove("qwee"));

        System.out.println("---------------------------------------");
        System.out.println(c.isEmpty());
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        c.clear();

        c.add("q");
        c.add("w");
        c.add("e");
        c.add(new Student());

        Object[] objs = c.toArray();
        for (Object i:objs
             ) {
            System.out.println(i);
        }


    }
}

class Student{

}

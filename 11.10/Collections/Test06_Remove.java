package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test06_Remove {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("qwe");
        c.add("ewq");
        c.add(123);

        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------------------------");
        it = c.iterator();
//        System.out.println(it.hasNext());
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
            it.remove();

        }
        System.out.println(c.size());
    }
}

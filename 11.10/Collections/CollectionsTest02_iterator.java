package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsTest02_iterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("qwe");
        c.add("abc");
        c.add(321);

        Iterator it = c.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

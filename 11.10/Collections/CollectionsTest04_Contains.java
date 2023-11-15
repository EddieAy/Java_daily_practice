package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsTest04_Contains {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
//        String s1 = new String("qwe");
//        String s2 = new String("abc");
//        c.add(s1);
//        c.add(s2);
//        System.out.println(c.size());
//
//        System.out.println(c.contains(new String("qwe")));

//        HashSetTest();
        Collection c = new ArrayList();
        String s1 = new String("qwe");
        c.add(s1);

        String s2 = new String("qwe");
        c.add(s2);
        System.out.println(c.size());
        c.remove(s2);
        System.out.println(c.size());

    }

    public static void HashSetTest(){
        Collection h = new HashSet();
        h.add(new Object());
        h.add(213);
        h.add("hello");
        h.add(true);

        Iterator it = h.iterator();
//        while (h.iterator().hasNext()){
//            System.out.println(h.iterator().next());
//        }
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

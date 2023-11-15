package Collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsTest03 {
    public static void main(String[] args) {
        Collection c2 = new HashSet();
        c2.add(698);
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(200);

        Iterator it = c2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

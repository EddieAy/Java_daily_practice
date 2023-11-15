package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List l1 = new LinkedList();
        l1.add(123);

        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

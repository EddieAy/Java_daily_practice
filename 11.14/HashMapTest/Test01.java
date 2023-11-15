package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(null,null);
        System.out.println(m1.size());

    }
}

/*    TreeSet<Turtle> s1 = new TreeSet<>(new Comparator<Turtle>() {
        @Override
        public int compare(Turtle o1, Turtle o2) {
            return 0;
        }
    });*/
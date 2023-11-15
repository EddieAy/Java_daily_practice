package SetTest;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> s2 = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            s2.add("hello_"+i);
        }
        s2.add("hello_a");
        s2.add("hello_A");
        s2.add("hello_牛");
        for (String s:s2
        ) {
            System.out.println(s);
        }


    }
}

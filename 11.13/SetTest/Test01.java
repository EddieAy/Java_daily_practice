package SetTest;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            s1.add("hello_"+i);
        }

        for (String s:s1
             ) {
            System.out.println(s);
        }
    }
}

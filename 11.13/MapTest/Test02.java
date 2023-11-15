package MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();

        m1.put(1,"qwe");
        m1.put(2,"cqa");
        m1.put(3,"c1");
        m1.put(4,"c2");


        Set<Integer> s1 = m1.keySet();
        for (Integer i:s1
             ) {
            System.out.printf("%s ",m1.get(i));
        }
        System.out.println();
        System.out.println("---------------------------");

        Set<Map.Entry<Integer,String>> s2 = m1.entrySet();
        for (Map.Entry<Integer,String> i:s2
             ) {
            System.out.printf("{%d : %s} ",i.getKey(),i.getValue());
        }
        System.out.println();
    }
}

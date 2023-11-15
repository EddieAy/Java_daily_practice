package MapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<>();
        m1.put("1","qwe1");
        m1.put("2","qwe2");
        m1.put("3","qwe3");
        m1.put("4","qwe4");

        String s3 = m1.get("4");
        System.out.println(s3);
        System.out.println(m1.size());
        m1.remove("4");
        System.out.println(m1.size());
        System.out.println(m1.containsKey("3"));
        System.out.println(m1.containsValue(new String("qwe1")));

        Collection<String> c1_value = m1.values();

    }
}

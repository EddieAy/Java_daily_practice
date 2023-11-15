package MapTest;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        Object o1 = new Object();
        Integer int1 = 1;
        System.out.println(int1.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}

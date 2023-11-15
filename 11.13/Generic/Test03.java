package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        Genshin<String> g1 = new Genshin<>();
        g1.getGenshin("Genshin Open");
//        g1.getGenshin(123);

        List<Integer> l1 = new ArrayList<>();
        l1.add(321);
        l1.add(63);

        for (Integer i:l1
             ) {
            System.out.println(i);
        }

    }
}


class Genshin<E> {

    private int da = 625;
    public double q2 = 3.14;

    public void test(int data){
        System.out.println(data);
    }


    public void getGenshin(E data){
        System.out.println(data);
    }
}

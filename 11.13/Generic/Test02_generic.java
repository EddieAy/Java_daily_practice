package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02_generic {
    public static void main(String[] args) {
        List<Animal> l1 = new ArrayList<>();

        l1.add(new Cat());
        l1.add(new Dog());

        Iterator<Animal> it = l1.iterator();

        while (it.hasNext()){
            Animal a1 = it.next();
            a1.move();
        }

    }
}

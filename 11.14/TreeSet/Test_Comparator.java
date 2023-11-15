package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Test_Comparator {
    public static void main(String[] args) {
        TreeSet<Turtle> s1 = new TreeSet<>(new Comparator<Turtle>() {
            @Override
            public int compare(Turtle o1, Turtle o2) {
                return 0;
            }
        });

        s1.add(new Turtle(123));
        s1.add(new Turtle(23));
        s1.add(new Turtle(1234));

        for (Turtle t:s1
             ) {
            System.out.println(t);
        }

    }
}

class Turtle{
    public int age;

    public Turtle() {
    }

    public Turtle(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "age=" + age +
                '}';
    }
}

/*
class TurtleComparator implements Comparator<Turtle>{

    @Override
    public int compare(Turtle o1, Turtle o2) {
        return o1.age - o2.age;
    }

}*/

package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Test05_Override {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Student05 s1 = new Student05("Jack");
        Student05 s2 = new Student05("Jack");
        c.add(s1);
        c.add(s2);
        System.out.println(c.size());
        Student05 s3 = new Student05("Jack");
        System.out.println(c.contains(s3));
        System.out.println("----------------------------------------");

        c.remove(s2);
        System.out.println(c.size());
    }
}

class Student05{
    private String name;

    public Student05(){

    }
    public Student05(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student05 student05 = (Student05) o;
        return Objects.equals(name, student05.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

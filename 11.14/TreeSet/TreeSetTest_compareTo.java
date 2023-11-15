package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest_compareTo {
    public static void main(String[] args) {

        Set<Student> set1 = new TreeSet<>();
        Student s1 = new Student("a",321);
        Student s2 = new Student("b",321);
        Student s3 = new Student("A",321);
        Student s4 = new Student("a",1321);
        Student s5 = new Student("-",321);
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        set1.add(s5);

        for (Student s:set1
             ) {
            System.out.println(s);
        }

        System.out.println("-".compareTo("A"));
        Set<String> string1 = new TreeSet<>();
        string1.add("-");
        string1.add("A");
        string1.add("a");
        for (String s12:string1
        ) {
            System.out.println(s12);
        }

    }
}


class Student implements Comparable<Student>{
    public String name;
    public long number;

    public Student(String name, long number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public int compareTo(Student o) {
        int i;
        i = this.name.compareTo(o.name);
        if (i == 0){
            return (int)(this.number - o.number);
        }else {
            return i;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}

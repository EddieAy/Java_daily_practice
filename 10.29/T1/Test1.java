package T1;

import java.util.Objects;

public class Test1 {

//    public String toString(String st){
//        return st;
//    }

    private int a;
    private int b;
    private int c;


    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test1 test1 = (Test1) o;
        return a == test1.a && b == test1.b && c == test1.c;
    }



    public static void main(String[] args) {

        Test1 t1 = new Test1();
//        System.out.println(t1.toString("123123"));
        System.out.println(t1.getClass());
        System.out.println(t1.hashCode());
        System.out.println(Integer.toHexString((t1.hashCode())));
//        System.out.println(String.valueOf(t1));

        Test1 t2 = new Test1();
        System.out.println(t1.equals(t2));

        if (t1 instanceof Test1)
            System.out.println("qweqe");
    }
}



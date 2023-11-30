package Reflect;

public class Test04_static {
    public static void main(String[] args) {
        try {
            Class.forName("Reflect.MyClass");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}


class MyClass{
    static {
        System.out.println("this is static");
    }
}
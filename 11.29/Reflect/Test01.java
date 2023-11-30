package Reflect;

public class Test01 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Reflect.Test02");
            Object obj = null;
            try {
                obj = c.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

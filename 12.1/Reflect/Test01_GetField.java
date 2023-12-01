package Reflect;

import java.lang.reflect.Field;

public class Test01_GetField {
    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass = Class.forName("Reflect.Student");

        try {
            Object obj = studentClass.newInstance();

            Field f1 = studentClass.getDeclaredField("money");
//            System.out.println(f1);
            f1.set(obj,9898.14);
//            System.out.println(obj);

            System.out.println(f1.get(obj));

            Field f2_pri = studentClass.getDeclaredField("name");
            f2_pri.setAccessible(true);
            f2_pri.set(obj,"CMU");



        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

    }
}

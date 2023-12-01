package Method;

import Reflect.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test02_Invoke {
    public static void main(String[] args) throws ClassNotFoundException {
//        Student s1 = new Student();
        Class<?> c1 = Class.forName("Reflect.Student");

        try {
            Method m1 = c1.getDeclaredMethod("info", String.class, String.class);
            Object obj;
            try {
                obj = c1.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            }
            m1.invoke(obj, "admin", "123");

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}



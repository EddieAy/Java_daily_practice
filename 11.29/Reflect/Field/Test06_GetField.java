package Reflect.Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test06_GetField {
    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass = Class.forName("Reflect.Field.Student");

        System.out.println(studentClass.getModifiers());
        System.out.println(studentClass.getTypeName());
        System.out.println(studentClass.getSimpleName());;
        System.out.println(studentClass.getName());;

        Field[] fs = studentClass.getFields();
        Field[] declaredFields = studentClass.getDeclaredFields();

        System.out.println(fs.length);
        System.out.println(fs[0]);

        System.out.println("----------------------------------------------------------\n\n");
//        System.out.println(declaredFields.length);
        for (Field f:declaredFields) {
//            Class c1 = f.getType();
//            System.out.println(c1.getName());
//            System.out.println(c1.getTypeName());

            System.out.println(Modifier.toString(f.getModifiers()));

//            System.out.println(f.getName());
        }
    }
}

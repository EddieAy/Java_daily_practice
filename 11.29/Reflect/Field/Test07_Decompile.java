package Reflect.Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test07_Decompile {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class c1 = Class.forName("Reflect.Field.Student");
        Class c1 = Class.forName("java.lang.Thread");

        StringBuilder sbd = new StringBuilder();

        sbd.append(Modifier.toString(c1.getModifiers()));
        sbd.append(" class ");
        sbd.append(c1.getSimpleName());
        sbd.append(" {\n");

        for(Field f1:c1.getDeclaredFields()){
            sbd.append("\t");
            sbd.append(Modifier.toString(f1.getModifiers()) + " " + f1.getType().getSimpleName() + " ");
            sbd.append(f1.getName() + "\n");
        }

        System.out.println(sbd);
    }
}

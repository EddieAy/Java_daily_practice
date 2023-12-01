package Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class StudentTestClass {

    public static void main(String[] args) throws ClassNotFoundException {
//        Student s1 = new Student();
//        s1.info("admin","123");
        StringBuilder s1 = new StringBuilder();
//        Class c1 = Class.forName("Reflect.Student");
        Class c1 = Class.forName("java.lang.reflect.Modifier");
        Method[] m1 = c1.getDeclaredMethods();
        //public String info(String userName, String password){
        for (Method m:m1) {
//            System.out.println(m);
            s1.append(Modifier.toString(m.getModifiers()));
            s1.append(" ");
            s1.append(m.getReturnType().getSimpleName());
            s1.append(" ");
            s1.append(m.getName());
            s1.append("(");
            Class<?>[] p1 = m.getParameterTypes();
            Parameter[] p2 = m.getParameters();
            for(int i=0;i< p1.length;i++){
                s1.append(p1[i].getSimpleName());
                s1.append(" ");
                s1.append("args, ");
//                s1.append(p2[i]);
            }
            s1.append("){");
            s1.append("\n");
        }

        System.out.println(s1);
    }
}

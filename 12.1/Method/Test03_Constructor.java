package Method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.TypeVariable;

public class Test03_Constructor {
    public static void main(String[] args) throws Exception{
        Class<?> c1 = Class.forName("Reflect.Student");

        Constructor<?>[] cons1 = c1.getDeclaredConstructors();
        StringBuilder s1 = new StringBuilder();
        for (Constructor<?> cons2:cons1) {
            s1.append(Modifier.toString(cons2.getModifiers()));
            s1.append(" ");
            s1.append(cons2.getName());
            s1.append("(");
//            Parameter[] p1 = cons2.getParameters();
            Class<?>[] c2 = cons2.getParameterTypes();
            for(Class c3:c2){
                s1.append(c3.getSimpleName());
                s1.append(",");
            }
            if(c2.length > 0){
                s1.deleteCharAt(s1.length() - 1);

            }
            s1.append(")");
            s1.append("\n");
        }

        System.out.println(s1);
    }
}

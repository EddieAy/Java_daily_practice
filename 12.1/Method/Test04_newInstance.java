package Method;

import java.lang.reflect.Constructor;

public class Test04_newInstance {
    public static void main(String[] args) throws Exception{
        Class<?> c1 = Class.forName("Reflect.Student");

        Constructor<?> singleConstructor = c1.getDeclaredConstructor();


        Class<?>[] classArray = new Class[]{int.class, String.class, double.class, boolean.class};
        Constructor<?> singleConstructor3 = c1.getDeclaredConstructor(classArray);

        Object obj3 = singleConstructor3.newInstance(11,"Jack",3.14,false);
        System.out.println(obj3);

        Object obj2 = singleConstructor.newInstance();
        System.out.println(obj2);
    }
}

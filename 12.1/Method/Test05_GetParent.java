package Method;

public class Test05_GetParent {
    public static void main(String[] args) throws Exception{
        Class<?> stringClass = Class.forName("java.lang.String");

        Class<?> c1 = stringClass.getSuperclass();

        System.out.println(c1.getName());

        Class[] interfacesClass = c1.getInterfaces();
        for (Class inter:interfacesClass) {
            System.out.println(inter.getName());
        }

    }
}

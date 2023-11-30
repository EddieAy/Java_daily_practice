package Reflect;

public class Test04_findpath {
    public static void main(String[] args) {
        String path2 = Thread.currentThread().getContextClassLoader().getResource("Reflect/db.properties").getPath();
        System.out.println(path2);
    }
}

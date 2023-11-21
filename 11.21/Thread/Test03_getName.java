package Thread;

public class Test03_getName {
    public static void main(String[] args) {
        Thread t1 = new myThread();
        System.out.println(t1.getName());
        t1.setName("qwe");
        System.out.println(t1.getName());
        t1.start();
    }
}

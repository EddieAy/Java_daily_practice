package Synchronized;

public class Test {
    public static void main(String[] args) {

        Account act = new Account();
        Thread t1 = new Thread(act,"t1");
        Thread t2 = new Thread(act,"t2");

        t1.start();
        t2.start();
    }
}




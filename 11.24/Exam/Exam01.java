package Exam;

import static java.lang.Thread.sleep;

public class Exam01 {
    public static void main(String[] args) {
/*        MyClass mc = new MyClass();
        Thread t1 = new MyThread("t1",mc);
        Thread t2 = new MyThread("t2",mc);*/

        MyClass2 mc = new MyClass2();
        MyClass2 mc2 = new MyClass2();


        Thread t1 = new MyThread2(mc);
        Thread t2 = new MyThread2(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();



    }
}



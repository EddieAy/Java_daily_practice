package Synchronized;

import static java.lang.Thread.sleep;

public class Account implements Runnable{
    public synchronized void synMethod(){
        System.out.println(Thread.currentThread().getName() + " Synchronized Method Start");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i + ": " + Thread.currentThread().getName() + " Synchronized Method is running");
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " Synchronized Method End");
    }

    public void nonSynMethod(){
        System.out.println(Thread.currentThread().getName() +  " Non-Synchronized Method Start");
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i + ": " + Thread.currentThread().getName() + " Non-Synchronized Method is running");
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() +  " Non-Synchronized Method End");
    }

    @Override
    public void run() {
        nonSynMethod();

        synMethod();
    }
}

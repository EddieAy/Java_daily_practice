package Daemon;

public class Company {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.setDaemon(true);

        t1.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " is running for " + (i+1) + " seconds");
        }


    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
    int i = 0;
    while (true){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " is running for " + (i++ +1) + " seconds");
    }

    }
}

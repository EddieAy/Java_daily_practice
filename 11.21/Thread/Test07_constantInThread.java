package Thread;

public class Test07_constantInThread {
    public static void main(String[] args) {
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getPriority());

//        Thread.currentThread().setPriority(1);

        Thread t1 = new Thread(new Runnable07(),"Work Thread");
//        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();



        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " is " + i);
        }
    }
}

class Runnable07 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (i % 100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + " is " + i);
        }
    }
}

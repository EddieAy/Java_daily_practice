package Thread;

public class Test02 {
    public static void main(String[] args) {
        Thread t = new Thread(new myThread2());
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread t = Thread.currentThread();

                for (int i = 0; i < 20; i++) {
                    System.out.println(t.getName() + " method execute --> " + i);
                }
            }
        });
        t.start();
        t2.start();

        for (int i = 0; i < 20; i++) {
            Thread t3 = Thread.currentThread();

            System.out.println(t3.getName() + " method execute --> " + i);
        }
    }
}

class myThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Thread t = Thread.currentThread();

            System.out.println(t.getName() + " method execute --> " + i);
        }
    }
}

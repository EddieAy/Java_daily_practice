package Thread;

public class Test02 {
    public static void main(String[] args) {
        Thread t = new Thread(new myThread2());
        Thread t2 = new Thread(new Runnable() {
            Thread t = Thread.currentThread();
            @Override
            public void run() {


                for (int i = 0; i < 20; i++) {
                    System.out.println(t.getName() + " method execute --> " + i);
                }
            }
        });
        t.start();
        t2.start();
        Thread t3 = Thread.currentThread();

        for (int i = 0; i < 20; i++) {

            System.out.println(t3.getName() + " outside method execute --> " + i);
        }
    }
}

class myThread2 implements Runnable{


    Thread t = Thread.currentThread();

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(t.getName() + " inside method execute --> " + i);
        }
    }
}

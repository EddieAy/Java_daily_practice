package Thread;

public class Test01 {
    public static void main(String[] args) {
        myThread m1 = new myThread();

        m1.start();
//        m1.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("Main method execute --> " + i);
        }
    }
}


class myThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread method execute --> " + i);
        }
    }
}

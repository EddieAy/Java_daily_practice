package Thread;

public class Test04_sleep {
    public static void main(String[] args) {
/*        try {
            Thread.sleep(1000* 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("hello");

        Thread t = new myThread3();

        t.start();

        t.interrupt();

        System.out.println("after Interupt hello");


    }
}

class myThread3 extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(10 * 1000);
            System.out.println("Inside Thread hello");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
//            System.out.println("bad");
//            e.printStackTrace();
        }
    }
}
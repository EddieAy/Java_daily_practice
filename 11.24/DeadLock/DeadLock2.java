package DeadLock;

public class DeadLock2 {
    public static void main(String[] args) {
        Object o3 = new Object();
        Object o4 = new Object();
        
        MyThread1 myMyThread1 = new MyThread1(o3,o4);
        MyThread2 myMyThread2 = new MyThread2(o3,o4);

        myMyThread1.start();
        myMyThread2.start();

    }
    
}

class MyThread1 extends Thread{
    Object o1;
    Object o2;

    public MyThread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    
    @Override
    public void run(){
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o2){
                System.out.println("Could this happen");
            }
        }
    }
}

class MyThread2 extends Thread{
    Object o1;
    Object o2;

    public MyThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run(){
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o1){
                System.out.println("Could this happen");
            }
        }
    }
}
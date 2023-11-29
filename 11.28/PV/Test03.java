package PV;

public class Test03 {
    public static void main(String[] args) {

        Object obj = new Object();
        MyCount mc1 = new MyCount();
        Odd03 odd = new Odd03(mc1,obj);
        Even03 even = new Even03(mc1,obj);
        // 建立奇数线程
        Thread t1 = new Thread(odd);
        // 建立偶数线程
        Thread t2 = new Thread(even);

        t1.setName("奇数线程");
        t2.setName("偶数线程");

        // 分别开启两个个线程
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}

class MyCount{
    int count = 0;
}

class Even03 implements Runnable{

    private MyCount count;
    private Object lock;

    public Even03(MyCount count, Object lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (count.count < 100){
            synchronized (lock){
//                System.out.println(Thread.currentThread().getName()+"在判断之前 执行，获取偶数：" + count);
                if(count.count % 2 == 0){
                    System.out.println(Thread.currentThread().getName()+"执行，获取偶数：" + count.count);
                    count.count++;
                    lock.notify();
                }else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

class Odd03 implements Runnable{

    private MyCount count;
    private Object lock;

    public Odd03(MyCount count, Object lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (count.count < 100){
            synchronized (lock){
//                System.out.println(Thread.currentThread().getName()+"在判断之前 执行，获取奇数：" + count);
                if(count.count % 2 == 1){
                    System.out.println(Thread.currentThread().getName()+"执行，获取奇数：" + count.count);
                    count.count++;
                    lock.notify();
                }else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
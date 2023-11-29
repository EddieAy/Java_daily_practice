package PV;

class Num{
    //　需要打印的数字 初始化为0
    int num = 0;
    // 打印奇数还是偶数的判定条件，也是线程间通信的条件
    // true和false的设定，根据打印奇数还是偶数开头进行设定
    boolean flag = true;
}

class Even implements Runnable {
    // 共享对象 实现锁的共享
    private Num n;
    private Object lock;
    private Integer count;

    public Even(Num n,Object lock,Integer count) {
        super();
        this.n = n;
        this.lock = lock;
        this.count = count;
    }
    @Override
    public void run() {
        try {
            // 打印的边界
            while (n.num < 100) {
                // n为共享对象 为了实现两个线程 共享同一把锁
                // 锁住对象n只有一个线程可以执行
                synchronized (lock) {
                    // 如果是true 则是开始打印偶数 因为我们初始值设置的是0
                    if (n.num % 2 == 0) {
                        System.out.println(Thread.currentThread().getName()+"执行，获取偶数：" + n.num);
                        // 打印之后对数字进行+1操作
                        n.num++;
                        // 将判定条件修改为false 目的是使当前线程等待
//                        n.flag = false;
                        // 唤醒奇数线程 只有两个线程所以使用notify就够了
                        lock.notify();
                    } else {
                        // 偶数打印线程进入阻塞状态 释放锁(奇数打印线程开始拿到锁进行打印)
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/**
 * 奇数打印线程实现类（分析过程如偶数打印线程）
 * @author zcl
 */
class Odd implements Runnable {
    private Num n;
    private Object lock;

    private Integer count;

    public Odd(Num n,Object lock,Integer count) {
        super();
        this.n = n;
        this.lock = lock;
        this.count = count;
    }


    @Override
    public void run() {
        try {
            while (n.num < 100) {
                synchronized (lock) {
                    // 此处一开始flag我们设定为true,所以如果奇数线程先执行，会直接进入else，成为阻塞状态
                    if (n.num % 2 == 1) {
                        System.out.println(Thread.currentThread().getName()+"执行，获取奇数：" + n.num);
                        n.num++;
//                        n.flag = true;
                        // 唤醒偶数线程
                        lock.notify();
                    } else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class Test02 {
    public static void main(String[] args) {
        // 新建一个线程共享对象
        Num num = new Num();
        Object lock = new Object();
        Integer count = 0;
        Odd odd = new Odd(num,lock,count);
        Even even = new Even(num,lock,count);
        // 建立奇数线程
        Thread t1 = new Thread(odd);
        // 建立偶数线程
        Thread t2 = new Thread(even);

        t1.setName("奇数线程");
        t2.setName("偶数线程");

        // 分别开启两个个线程
        t1.start();
        t2.start();
    }
}
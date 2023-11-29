//package PV;
//
//public class Homework_oddeven {
//    public static void main(String[] args) throws InterruptedException {
//        int i = 0;
//        Object obj = new Object();
//        Odd o1 = new Odd(i,obj);
//        Even e1= new Even(i,obj);
//
//        Thread threadOdd = new Thread(o1,"Odd");
//        Thread threadEven = new Thread(e1,"Even");
//
//        threadEven.start();
////        Thread.sleep(10);
//        threadOdd.start();
//
//
//
////        Thread.sleep(10);
//    }
//}
//
//class Odd implements Runnable {
//
//    int count;
//    Object lock;
//
//    public Odd(int count, Object obj) {
//        this.lock = obj;
//        this.count = count;
//    }
//
//    @Override
//    public void run() {
//        synchronized (lock){
//            while (count < 50){
//                if (count % 2 == 1){
//                    System.out.println(Thread.currentThread().getName() + " ---> " + count);
//
//                }
//                count++;
//                lock.notifyAll();
//                try {
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            lock.notifyAll();
//        }
//
//    }
//}
//
//class Even implements Runnable {
//    int count;
//    Object lock;
//
//    public Even(int count, Object obj) {
//        this.count = count;
//        this.lock = obj;
//    }
//
//    @Override
//    public void run() {
//        synchronized (lock){
//            while (count < 50){
//                if (count % 2 == 0){
//                    System.out.println(Thread.currentThread().getName() + " ---> " + count);
//
//                }
//                count++;
//                lock.notifyAll();
//                try {
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            lock.notifyAll();
//        }
//    }
//}

package PV;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Producer p1 = new Producer(list);
        Consumer c1 = new Consumer(list);

        Thread producerThread = new Thread(p1,"Consumer");
        Thread consumerThread = new Thread(c1,"Producer");

        producerThread.start();
        consumerThread.start();

    }
}


class Producer implements Runnable {

    List<Integer> list;

    public Producer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        // Continue to produce
        while (true) {
            synchronized (list) {
                if (list.size() > 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                Integer i1 = 5;
                list.add(i1);
                System.out.println(Thread.currentThread().getName() + " ---> " + i1 );
                list.notify();
            }
        }
    }
}

class Consumer implements Runnable {
    List<Integer> list;

    public Consumer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //Continue to consume
        while (true) {
            synchronized (list) {
                if (list.isEmpty()){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " ---> " + list.remove(0));
                list.notifyAll();
            }
        }
    }
}
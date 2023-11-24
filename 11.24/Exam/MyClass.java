package Exam;

import java.lang.Thread;

public class MyClass{
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("doSome end");
    }

    public void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther end");
    }
}

class MyThread extends Thread{

    private MyClass mc;

    public MyThread(String name, MyClass mc) {
        super(name);
        this.mc = mc;
    }

    @Override
    public void run(){
        if (Thread.currentThread().getName() == "t1"){
            mc.doSome();
        }else {
            mc.doOther();
        }
    }
}
package Exam;

public class MyClass2{
    public synchronized static void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("doSome end");
    }

    public synchronized static void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther end");
    }

}

class MyThread2 extends Thread{

    private MyClass2 mc;

    public MyThread2(MyClass2 mc) {
        this.mc = mc;
    }

    @Override
    public void run(){
        if (Thread.currentThread().getName() == "t1"){
//            mc.doSomeStatic();
            mc.doSome();
        }else {
            mc.doOther();
        }
    }
}
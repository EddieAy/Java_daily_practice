package ThirdThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test01 {
    public static void main(String[] args) throws Exception{
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {

                System.out.println("Call method begin");
                Thread.sleep(1000 * 5);
                System.out.println("Call method end");

                int a = 100;
                int b = 200;
                return a + b;
            }
        });


        Thread t1 = new Thread(task);

        t1.start();

        Object obj = task.get();
        System.out.println("This is obj : " + obj);
        System.out.println("qeqweqwe");

    }
}

package Thread;

public class Test05_correctStop {
    public static void main(String[] args) {
        myRunable r = new myRunable();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}

class myRunable implements Runnable{

    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName() + " ---> "+ i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                return;
            }
        }
    }
}
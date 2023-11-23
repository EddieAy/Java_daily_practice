package Thread;

class WorkerThread extends Thread {
    public void run() {
        System.out.println("工作线程正在运行");
        try {
            Thread.sleep(3000); // 模拟一些耗时的任务
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("工作线程完成");
    }
}

public class Test06_joinMethod {
    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread();

        // 启动工作线程
        workerThread.start();

        System.out.println("主线程正在做一些工作");

        try {
            // 主线程等待工作线程完成
            workerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程完成");
//        new Thread()
    }
}

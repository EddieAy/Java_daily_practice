package DeadLock;

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource("CPU");
        Resource r2 = new Resource("GPU");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                r1.acquireResource(r2);
            }
        });
        t1.setName("t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                r2.acquireResource(r1);
            }
        });
        t2.setName("t2");

        t1.start();
        t2.start();
    }

}


//  先拿了资源再释放    资源必须能够共享

class Resource{
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void releaseResource(){
        System.out.println(Thread.currentThread().getName() + " has released " + this.getName());
    }

    public void acquireResource(Resource requiredResource){
        System.out.println(Thread.currentThread().getName() + " is trying to acquire " + requiredResource.getName());
        releaseResource();
    }

    public void setName(String name) {
        this.name = name;
    }
}

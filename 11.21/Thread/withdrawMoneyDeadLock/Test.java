package Thread.withdrawMoneyDeadLock;

public class Test {
    public static void main(String[] args) {
        Account act1 = new Account(10000, "act1");

        Thread t1 = new AccountThread(act1);
        t1.setName("t1");
        Thread t2 = new AccountThread(act1);
        t2.setName("t2");

        t1.start();
        t2.start();


    }

}

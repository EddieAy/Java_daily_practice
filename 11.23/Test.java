public class Test {
    public static void main(String[] args) {
        Account act = new Account("Jack",10000);

        AccountThread at1 = new AccountThread(act);
        AccountThread at2 = new AccountThread(act);

        Thread t1 = new Thread(at1,"t1");
        Thread t2 = new Thread(at2,"t2");

        // START TO TEST
        t1.start();
        t2.start();


    }
}

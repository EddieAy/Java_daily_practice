public class AccountThread implements Runnable{

    public Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        double withdrawalAmount = 5000.0;

        double after = act.getBalance() - withdrawalAmount;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        act.setBalance(after);

        System.out.println("After withdrawal, " + Thread.currentThread().getName() + " has " + act.getBalance());

    }
}

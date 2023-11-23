package Thread.withdrawMoneyDeadLock;

public class AccountThread extends Thread{
    private Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        double moneyToWithDraw = 5000;
        account.withDrawMoney(moneyToWithDraw);

        System.out.println(Thread.currentThread().getName() + "对"+account.getName() + "取款, 余额为: " + account.getBalance());
    }
}

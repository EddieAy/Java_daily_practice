package Synchronized;

public class AccountThread implements Runnable{

    public Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        double withdrawalAmount = 5000.0;
        act.withdrawalMoney(withdrawalAmount);



    }
}

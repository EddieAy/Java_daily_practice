package Thread.withdrawMoneyDeadLock;

public class Account {
    private double balance;
    private String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withDrawMoney(double money) {
        double before = this.getBalance();

        double after = before - money;



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.setBalance(after);

    }
    
    //查询余额

}

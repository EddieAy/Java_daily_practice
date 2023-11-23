package Synchronized;

public class Account {

    private String name;
    private double balance;

    Object obj = new Object();

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawalMoney(double money){
        Object obj2 = new Object();
        if (money > this.getBalance() || money <= 0){
            throw new IllegalArgumentException("Invalid withdrawal money amount");
        }else {
            synchronized (obj){
                double after = this.getBalance() - money;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("After withdrawal, " + Thread.currentThread().getName() + " has " + this.getBalance());

                this.setBalance(after);
            }
        }
    }
}

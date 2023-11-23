public class Account {

    private String name;
    private double balance;

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
        if (money > this.getBalance() || money <= 0){
            throw new IllegalArgumentException("Invalid withdrawal money amount");
        }else {
            synchronized (this){
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

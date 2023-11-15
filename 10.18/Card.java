public class Card {
    private String cardHolder;
    private double balance;

//    public Card(String cardHolder,double balance){
//        this.cardHolder = cardHolder;
//        this.balance = balance;
//    }

    public String getCardHolder(){
        return this.cardHolder;
    }

    public void setCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

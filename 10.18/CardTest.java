public class CardTest {
    public static void main(String[] args){
        CreditCard c1 = new CreditCard();

        c1.setCredit(99.6);
        System.out.println(c1.getCredit());
        c1.setBalance(114514.114514);
        System.out.println(c1.getBalance());
//        System.out.println(c1.cardHolder);
    }
}

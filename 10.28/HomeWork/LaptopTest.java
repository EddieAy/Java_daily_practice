package HomeWork;

public class LaptopTest {
    public static void main(String[] args) {
        InsertDrawable m1 = new Mouse();
        LapTop l1 = new LapTop(m1);
//        l1.set_interface(m1);
//        System.out.println(l1.get_interface());
        l1.setPrice(7499);

        l1.recharge();
        InsertDrawable k1 = new Keyboard();
        l1.set_interface(k1);
        l1.recharge();



    }
}

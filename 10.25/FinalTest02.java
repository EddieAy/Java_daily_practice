public class FinalTest02 {
    public static void main(String[] args) {
        Ani a1 = new Ani();
        a1.a2 = 250;
        System.out.println(a1.a2);
        Ani classa2 = new Ani();
        System.out.println(classa2.a2);
        System.out.println(Ani.a2);

        A1025 class_a1025 = new A1025();
        class_a1025.a1025 = 663;
        class_a1025.getInt();
    }
}


class Ani{
    static int a2 = 10;

}

final class A1025{
    int a1025 = 100;

    final void getInt(){
        System.out.println(a1025);
    }

}

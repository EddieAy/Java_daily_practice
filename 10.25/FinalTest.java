public class FinalTest {

    public static void main(String[] args) {
        new B().doSome();
        final int i = 200;
//        i = 300;
    }
}
class A{
    public void doSome(String i){
        System.out.println("A"+i);
    }
}

class B extends A{
//    @Override

    final int a = 200;
    public final void doSome() {
        super.doSome("qwe");
//        this.a = 300;
    }
}

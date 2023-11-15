package T1;

public class FinalizeTest {
    public static void main(String[] args) {
        for (long i = 0; i < 10000000000L; i++) {
            FinalizeTest f1 = new FinalizeTest();
//        f1.finalize();
            f1 = null;
        }

    }

}

class Person{

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("I am just trying this finalize method");
    }
}

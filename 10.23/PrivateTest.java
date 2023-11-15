public class PrivateTest {

    public void test(){
        System.out.println("This is a private method in superclass");
    }

    public void test2(){

    }

    public static void main(String[] args) {
        PrivateTest p1 = new PrivateTest();
        p1.test();
        PrivateTest p2 = new subClass();
        p2.test();
        p2.test2();
    }
}

class subClass extends PrivateTest{

    public void test(){
        System.out.println("This is a public method in subclass");
    }

    public void test2(){
        this.test();
    }


}
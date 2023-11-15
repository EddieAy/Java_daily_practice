public class InterfaceTest {

    public static void main(String[] args) {

    }
}

interface A{
    double PI = 3.1415926;


    void showPi2();

//    int mySum();
}

class B implements A{

    public void showPi2(){
        System.out.println("123123");
    }
}

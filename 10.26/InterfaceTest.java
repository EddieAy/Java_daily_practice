public class InterfaceTest {
    public static void main(String[] args) {

    }
}

interface A{
    public abstract void doSome();

    int mySum();

}

interface B{

}

interface C extends A,B{

}

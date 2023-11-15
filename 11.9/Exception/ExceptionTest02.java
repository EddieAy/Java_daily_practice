package Exception;

public class ExceptionTest02 {
    public static void main(String[] args) {
        myException m1 = new myException("not input");

        m1.printStackTrace();
        System.out.println(m1.getMessage());
    }
}

class A{

}

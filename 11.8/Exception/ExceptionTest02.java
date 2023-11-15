package Exception;

public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("do Some!!");
    }
}

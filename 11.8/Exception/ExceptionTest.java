package Exception;

public class ExceptionTest {
    public static void main(String[] args) {
        NumberFormatException nfe = new NumberFormatException("Error");

        System.out.println(nfe);

        NullPointerException npe = new NullPointerException("Null pointer Exception");
        System.out.println(npe);

        System.out.println(10 / 0);
        System.out.println("qwe");
    }
}

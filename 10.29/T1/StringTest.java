package T1;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "qwe";
        String s2 = "qwe";

        String s3 = new String("qwer");
        String s4 = new String("qwer");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1.toString());
        System.out.println(s3.toString());

    }
}

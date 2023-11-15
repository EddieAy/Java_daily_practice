public class StringBufferTest {
    public static void main(String[] args) {
//        String s1 = "";
//        for (int i = 0; i < 10; i++) {
//            s1+=i;
//            System.out.println(s1);
//        }
//
//        String s2 = "qwe";
//        s2 = s2 + 789;
//        System.out.println(s2);

        StringBuffer s1 = new StringBuffer();
        s1.append("qwe");
        s1.append(123);
        s1.append(true);
        s1.append(new Object());

        System.out.println(s1);

    }
}

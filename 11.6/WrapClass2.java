public class WrapClass2 {
    public static void main(String[] args) {
//        Integer x = new Integer("312");
//        int y = x.intValue();
//        System.out.println(y);
//        System.out.println(x);
        Integer x1 = 17;
        System.out.println(Integer.toBinaryString(x1));
        System.out.println(x1.hashCode());
        Object o1 = new Object();
        System.out.println(o1.toString());
        System.out.println(o1.hashCode());
        System.out.println(Integer.toHexString(o1.hashCode()));

        System.out.println();
        System.out.println(Integer.toHexString(444));

        //int -- > String       String s1 = String.valueOf(320)
        //String -- > int    int b = Integer.parseInt("320")

    }

}

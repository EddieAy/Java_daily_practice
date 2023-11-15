package enum2;

public class EnumTest01 {
    public static void main(String[] args) {
        System.out.println(32 / 6);
        System.out.println(32 % 6);
//        System.out.println(32 / 0);
        A a1 = new B();

        System.out.println((a1 instanceof A)? "Yes":"NO");
    }
}

class A{

}

class B extends A{

}

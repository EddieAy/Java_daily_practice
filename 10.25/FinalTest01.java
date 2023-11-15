public class FinalTest01 {

    public static void main(String[] args) {
        final Animal a1 = new Animal(123);

//        a1 = new Animal(321);
        a1.b = 321;
//        a1.a = 65;
        System.out.println(a1.b);

    }

}

class Animal{

    final int a;
    int b = 200;

    public Animal(int b) {
        this.b = b;
        this.a = 321;
        this.b = 12313132;
    }


}

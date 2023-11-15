public class SuperTest01 {
    public static void main(String[] args) {

    }
}

class A1{
    private int a1 = 100;

    public A1(){
        System.out.println("1");
    }

    public A1(int i){
        System.out.println("2" + i);
    }
}

class B1 extends A1{

    private int b1 = 200;
    public B1(int a1, int b1 ){
        this.b1 = b1;
        this.a1 = a1;
    }
}


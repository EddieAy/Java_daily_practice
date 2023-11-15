public class SuperTest {

    public static void main(String[] args) {
        new B();
    }
}


class A{
    public A(int i ){
        System.out.println("A's non-args constructor method execute"+ i);
    }

    public A(){

    }

}

class B extends A{
    public B(){
        //super(123);
        this("asd");
//        System.out.println("B's method");
    }

    public B(String name){
        System.out.printf("B's method %s",name);
    }
}

//A无 --> B无 C有参数 C有一个参数 C无参数
//1 3 6  5  4
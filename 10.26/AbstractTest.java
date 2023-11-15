public class AbstractTest {

    public static void main(String[] args) {

    }
}

abstract class Animal{

    public Animal(){

    }

    public Animal(String s){
        System.out.println(s+" is ready");
    }

    public abstract void doSome();
}

class Cat extends Animal{
    public Cat(){

    }

    public void doSome(){

    }

}

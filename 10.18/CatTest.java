public class CatTest {
    public static void main(String [] args){
        Cat c1 = new Cat();
//        System.out.println(c1.move());
        c1.move();
        System.out.println(c1.name);
    }


}

class Animal{
    String name = "Cat";

    public void move(){
        System.out.println(name + " is moving");
    }
}

class Cat extends Animal{

}

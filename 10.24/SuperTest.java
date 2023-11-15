public class SuperTest {
    public static void main(String[] args) {
        Cat c1 = new Cat("YanLo");
        c1.shopping();
        System.out.println(c1.name);
        c1.doSome();
    }
}

class Animal{
    String name;

    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }


}

class Cat extends Animal{

//    String name;

    public Cat(){

    }
    public Cat(String name){
        super(name);
        this.name = "Orange";
    }

    public void shopping(){
        System.out.printf("%s(this.name) is shopping\n",this.name);
        System.out.printf("%s(super.name) is shopping\n",super.name);
        System.out.printf("%s(name) is shopping\n",name);

    }

    public String toString(){
        return  "Cat String";
    }

    public void doSome(){
        System.out.println(this);
        System.out.println(super.toString());
    }

}
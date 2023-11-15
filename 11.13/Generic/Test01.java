package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List l1 = new ArrayList();

        Cat c = new Cat();
        Dog d = new Dog();

        l1.add(c);
        l1.add(d);

        Iterator it = l1.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if (obj instanceof Animal){
                Animal a1 = (Animal)obj;
                a1.move();

            }
            if (obj instanceof Cat){
                Cat c1 = (Cat) obj;
                c1.catMove();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("Animal is moving");
    }
}

class Cat extends Animal{

    public void catMove(){
        System.out.println("Cat is moving");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Cat is Swimming");
    }
}

class Dog extends Animal{
    public void dogMove(){
        System.out.println("Dog is moving");
    }
}

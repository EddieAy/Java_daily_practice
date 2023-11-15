public class Animal {
    public void move(){
        System.out.println("Animal is moving");
    }

}

class cat extends Animal{
    public void move(){
        System.out.println("Cat is moving");
    }
}


class bird extends Animal{
    public void move(){
        System.out.println("bird is moving");
    }

    public void sing(){
        System.out.println("bird is singing");
    }
}
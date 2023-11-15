public class Animal {

    public void move(){
        System.out.println("Animal is moving");
    }
}

class cat extends Animal{
    public void move(){
        System.out.println("Cat is moving");
    }

    public void hunt(){
        System.out.println("Cat is hunting mouse");
    }
}

class fish extends Animal{
    public void move(){
        System.out.println("Fish is swimming in water");
    }

}

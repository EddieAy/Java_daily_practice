public class Instrument {

    public void makeSound(){

    }
}

class Piano extends Instrument{
    public void makeSound(){
        System.out.println("My soul");
    }
}

class Guitar extends Instrument{
    public void makeSound(){
        System.out.println("Letting go");
    }
}

class Musician {
    public void play(Instrument ins){
        ins.makeSound();
    }
}

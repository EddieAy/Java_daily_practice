public class BirdTest {

    public static void main(String[] args) {
        Slingshot s1 = new Slingshot();
        s1.shot(new Red());

        s1.shot(new Yellow());
        s1.shot(new Blue());

    }
}

class Slingshot {
    public void shot(Bird b){
        System.out.println("Sling shot is ready!");
        b.fly();
    }
}


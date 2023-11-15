public class PolyTest {
    public static void main(String[] args) {
        Animal a1 = new bird();

        bird b1 = (bird) a1;
//        if (a1 instanceof cat){
//            cat c1 = (cat) a1;
//        }
        if (a1 instanceof bird){
            System.out.println("123");
        }
        if (a1 instanceof Animal){
            System.out.println("1234");
        }


    }
}

public class CastTest {
    public static void main(String[] args) {
        M m = new myClass();

        if (m instanceof E){
            E myE = (E)m;

        }
    }
}

interface E{}

interface M{}
class myClass implements M{

}
public class InterfaceTest01 {
    public static void main(String[] args) {
        ability r1 = new Red();
        r1.myAbility();
    }
}

interface ability{
    void myAbility();
}

class Person{

}

class Red extends Person implements ability{
    public void myAbility(){
        System.out.println("Red is coming");
    }
}

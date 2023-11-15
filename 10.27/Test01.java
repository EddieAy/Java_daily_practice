public class Test01{
    public static void main(String[] args) {
        A1 myA1 = new inClass();
        myA1.a1();

        if (myA1 instanceof A2){
            A2 myA2 = (A2)myA1;
            myA2.a2();
        }

    }
}


interface A1{
    void a1();
}

interface A2{
    void a2();
}

interface A3{
    void a3();
}

class inClass implements A1,A2,A3{
    public void a1(){

    }

    public void a2(){
        System.out.println("a2's method execute");
    }

    public void a3(){

    }
}

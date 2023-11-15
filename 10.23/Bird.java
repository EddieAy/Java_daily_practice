public class Bird {

    public void fly(){

    }
}

class Red extends Bird{
    public void fly(){
        System.out.println("Red bird is flying normally");
    }
}


class Blue extends Bird{
    public void fly(){
        System.out.println("Blue bird is split into three birds");
    }
}

class Yellow extends Bird{
    public void fly(){
        System.out.println("Yellow bird is rushing");
    }
}
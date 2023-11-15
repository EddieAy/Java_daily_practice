package HomeWork;

public interface InsertDrawable {

    void use();

    void recharge();
}

class Mouse implements InsertDrawable{
    public void use(){
        System.out.println("Mouse is ready");
    }

    @Override
    public void recharge() {
        System.out.println("Mouse is recharging");
    }
}

class Keyboard implements InsertDrawable{
    @Override
    public void use() {
        System.out.println("Keyboard is using");
    }

    @Override
    public void recharge() {
        System.out.println("Keyboard is recharging");
    }
}
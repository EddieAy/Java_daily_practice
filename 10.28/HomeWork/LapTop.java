package HomeWork;

public class LapTop {
    private int price;

    private InsertDrawable _interface;

    public LapTop(){

    }

    public LapTop(InsertDrawable _interface) {
        this._interface = _interface;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public InsertDrawable get_interface() {
        return _interface;
    }

    public void set_interface(InsertDrawable _interface) {
        this._interface = _interface;
    }

    public void use(){
        this._interface.use();
    }

    public void recharge(){
        this._interface.recharge();
    }
}

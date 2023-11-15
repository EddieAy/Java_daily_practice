public class Customer {
    private FoodMenu foodMenu;


    public Customer(){

    }
    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public void order(){
        FoodMenu f = this.getFoodMenu();
        f.hotPot();
        f.intestineNoodle();
    }
}

public class OrderFoodTest {
    public static void main(String[] args) {
        FoodMenu f1 = new Chuan();
        FoodMenu f2 = new Yue();
        Customer c1 = new Customer(f2);

        c1.order();
    }
}

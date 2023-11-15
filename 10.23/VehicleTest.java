public class VehicleTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Mercedes");
        c1.setLicensePlateNumber("JA88888");
        c1.setCarType("B");

//        System.out.println(c1.getCarType());
        System.out.println("The cost of renting "+c1.getBrand()+" with " +
                c1.getLicensePlateNumber() +" is " + c1.getSumRent(30) + " per day");


    }

}

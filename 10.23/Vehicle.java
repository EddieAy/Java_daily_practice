import java.sql.SQLOutput;

public class Vehicle {
    private String brand;
    private String licensePlateNumber;

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public double getSumRent(int days){
        return 0.0;
    }
}

class Car extends Vehicle{
    private String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getDayRent(String carType){
        double dayRent = 0.0;
        switch (carType){
            case "A":
                dayRent = 300.0;
                break;
            case "B":
                dayRent = 500.0;
                break;
            case "C":
                dayRent = 700.0;
                break;
            default:
                System.out.println(carType+" is not supported");

        }
        return dayRent;
    }

    public double getSumRent(int days){
        return this.getDayRent(this.carType) * days;
    }
}

class Bus extends Vehicle{
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getDayRent(int seats){
        if (seats <= 16){
            return 400.0;
        }else{
            return 600;
        }
    }

    @Override
    public double getSumRent(int days) {
        return  this.getDayRent(seats) * days;
    }
}
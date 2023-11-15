public class Employee {
    String name;
    int birthMonth;

    public double getSalary(int month){
//        if(month == this.birthMonth){
//            basicSalary += 250;
//        }
//        return this.basicSalary;

        return 0.0;
    }

    public void printSalary(int month){
        System.out.println(this.name + "'s this month's salary is "+ this.getSalary(month));
    }

}

class salariedEmployee extends Employee{
    int monthlySalary;

    public salariedEmployee(String name,int birthMonth,int monthlySalary){
        this.name = name;
        this.birthMonth = birthMonth;
        this.monthlySalary = monthlySalary;
    }

    public double getSalary(int month){
        if(month == this.birthMonth){
            monthlySalary += 250;
        }
        return this.monthlySalary;
    }
}

class hourEmployee extends Employee{
    int hours;
    int hourSalary;


    public hourEmployee(String name,int birthMonth,int hours,int hourSalary){
        this.name = name;
        this.birthMonth = birthMonth;
        this.hours = hours;
        this.hourSalary = hourSalary;
    }
    @Override
    public double getSalary(int month) {
        double _basicSalary = 0.0;
        if (this.hours >= 0 & this.hours <= 160){
            _basicSalary = hours * hourSalary;
        } else if (this.hours > 160) {
            _basicSalary = 160 * hourSalary + (this.hours - 160) * 1.5 * hourSalary;
        }

        if (month == this.birthMonth){
            return  _basicSalary + 250;
        }else {
            return _basicSalary;
        }
    }
}

class salesEmployee extends Employee{
    int sales;
    double commons;

    public salesEmployee(String name,int birthMonth,int sales, double commons){
//        assert commons >=0.0 && commons <=1.0 : "commons must >=0 and <=1.0";
        if (commons <0.0 || commons>1.0){
            throw new IllegalArgumentException("Commons must be between 0.0 and 1.0");
        }
        this.name = name;

        this.birthMonth = birthMonth;
        this.sales = sales;
        this.commons = commons;
    }


    @Override
    public double getSalary(int month) {
        double _basicSalary = 0.0;
        _basicSalary = sales * (1 + commons);
        if (month == this.birthMonth){
            return  _basicSalary + 250;
        }else {
            return _basicSalary;
        }
    }
}
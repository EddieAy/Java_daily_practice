public class EmployeeTest {
    public static void main(String[] args) {
        salariedEmployee s1 = new salariedEmployee("Jack",9,3000);
        double salary = s1.getSalary(8);
//        System.out.println("Salary is " + salary);
//        s1.printSalary(1);

        hourEmployee s2 = new hourEmployee("Merry",6,210,144);
        s2.printSalary(7);

        salesEmployee s3 = new salesEmployee("Dantin",4,25000,0.3);
        s3.printSalary(7);
    }


}

public class oop{
    public static void main(String[] args){

        Address stu_addr = new Address();

        stu_addr.province = "SiChuan";
        stu_addr.city = "ChengDu";
        stu_addr.street = "NanYang";


        student merry = new student();
        // System.out.println(merry.num);
        merry.name = "merry";
        merry.gender = "male";
        merry.addr = stu_addr;

        System.out.println(merry.name);
        System.out.println(merry.gender);
        System.out.println(merry.addr.city);



    }

    // public static void method(){
    //     System.out.println(i);
    // }

}


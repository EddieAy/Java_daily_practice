public class thisTest{

    static int k = 10;

    public static void staticTest(){
        System.out.println("static method");
        System.out.println(++k);

    }

    public static void main(String[] args){
        // System.out.println(k);
        student s1 = new student("jack");
        s1.info();
        student s2 = new student("love");
        s2.info();

        staticTest();
        System.out.println(k);

        System.out.println();
        thisTest this2 = new thisTest();


    }
}

class student{
    String name;

    public student(){

    }

    public student(String a){
        name = a;
    }

    public String getName(){
        return name;
    }

    public void info(){
        System.out.println("The student name is " + this.name);
        // return name;
    }

}
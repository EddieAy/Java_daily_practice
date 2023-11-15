public class student{

    String name;
    String gender;
    int num;
    public student(){
        System.out.println("This is a test");
    }

    public student(String a,String b){
        System.out.println("The student "+ a + " is " + b);
    }

    public student(String name,String b,int c){
        name = name;
        gender = b;
        num = c;
        System.out.println("The student "+ name + " is " + b+" ID: "+ c);
    }
}
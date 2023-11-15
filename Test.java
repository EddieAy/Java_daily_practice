public class Test{

    public static void main(String[] args){
        int number = 196;
        String name = "Eddie";
        char gender = '男';
        double height = 1.71;


        print(number,name,gender,height);
        print(123,"qwe",'a',-1.3);
    }

    public static void print(int number,String name,char gender,double height){
        System.out.println("Number is "+number);
        System.out.println("Name is "+name);
        System.out.println("Gender is "+gender);
        System.out.println("Height is " + height);

    }
}
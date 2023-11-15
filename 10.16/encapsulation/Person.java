public class Person{
    private int age;
    private String name;
    private String gender;


    // 空的构造方法
    public Person(){

    }

    // 非空的构造方法
    public Person(int a,  String b, String c){
        age = a ;
        name = b;
        gender = c;
    }

    // name set
    public void setName(String inputName){
        name = inputName;
    }

    public String getName(){
        return name;
    }

    // gender set
    public void setGender(String inputGender){
        gender = inputGender;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int inputAge){
        if (inputAge < 0 || inputAge >200){
            System.out.println("Input age is invalid. ");
            return ;
        }
        age = inputAge;
    }
}
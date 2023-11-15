public class PersonTest{
    public static void main(String [] args){
        Person p = new Person();
        // System.out.println(p.age);
        // p.age = 32;
        System.out.println(p.getAge());
        p.setAge(18);
        System.out.println(p.getAge());

        System.out.println(p.getGender());
        System.out.println(p.getName());

        p.setName("jack");
        p.setGender("male");

        System.out.println(p.getGender());
        System.out.println(p.getName());


    }
}
package Reflect;

import java.lang.reflect.Field;

public class Student {
    public int id = 10;
    private String name = "MIT";

    protected double money = 114.514;

    boolean sex = false;

    public String info(String userName, String password){
        if("admin".equals(userName) && "123".equals(password)){
            Class c1 = this.getClass();
            Field[] f1 = c1.getDeclaredFields();

            for (Field f: f1) {
                f.setAccessible(true);
                try {
                    System.out.println(f.getName() + ":" + f.get(this));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

            }
        }

        return "something";
    }

    public void printNothing(boolean sex){
        System.out.println("114514 " +sex);
    }

    private static void doSomething(){
        System.out.println("Nothing here");
    }


    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Student(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Student(int id, String name, double money, boolean sex) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", sex=" + sex +
                '}';
    }
}

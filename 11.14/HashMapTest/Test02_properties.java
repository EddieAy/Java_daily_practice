package HashMapTest;

import java.util.Properties;

public class Test02_properties {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("username","admin");
        pro.setProperty("password","123");

        System.out.println(pro.getProperty("username"));
        System.out.println(pro.getProperty("password"));


    }
}
